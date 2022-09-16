package com.bbva.cpqr.batch.process;

import com.bbva.cpqr.dto.datos.Banks;
import com.bbva.cpqr.dto.datos.PersonaOut;
import com.bbva.cpqr.lib.r015.CPQRR015;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Write implements Tasklet {

    private static final String CABECERA = "NombreCliente"+"|"+"NumeroCuenta"+"|"+"4x1000\n";
    private String inPath;
    private CPQRR015 cpqrR015;
    private  String cliente;


    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws IOException, ParseException {

        Banks banks =cpqrR015.execute(cliente);
        List<PersonaOut> banksList = new ArrayList<>();
        PersonaOut personaOut = new PersonaOut();
        PersonaOut personaOutTrue = new PersonaOut();

        for(int i=0;i<banks.getBanksDatos().size();i++){
            if(banks.getBanksDatos().get(i).getCuatroXMil().equals(true)){
                personaOutTrue.setNombreCliente(banks.getUserName());
                personaOutTrue.setNumeroCuenta(banks.getBanksDatos().get(i).getNumber());
                personaOutTrue.setCuatroMil(banks.getBanksDatos().get(i).getCuatroXMil());
            }
        }

        try (BufferedWriter escritura = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inPath), StandardCharsets.ISO_8859_1))) {
            escritura.write(CABECERA);
            escritura.write(personaOutTrue.toString());
            for(int i=0;i<banks.getBanksDatos().size();i++){
                personaOut.setNombreCliente(banks.getUserName());
                personaOut.setNumeroCuenta(banks.getBanksDatos().get(i).getNumber());
                personaOut.setCuatroMil(banks.getBanksDatos().get(i).getCuatroXMil());
                escritura.write(personaOut.toString());
            }
        }

        return RepeatStatus.FINISHED;
    }


    public void setInPath(String inPath) {
        this.inPath = inPath;
    }

    public void setCpqrR015(CPQRR015 cpqrR015) {
        this.cpqrR015 = cpqrR015;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
