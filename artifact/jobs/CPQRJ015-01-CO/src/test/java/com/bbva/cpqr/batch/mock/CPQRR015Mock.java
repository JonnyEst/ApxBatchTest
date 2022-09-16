package com.bbva.cpqr.batch.mock;

import com.bbva.cpqr.dto.datos.Banks;
import com.bbva.cpqr.dto.datos.BanksDatos;
import com.bbva.cpqr.lib.r015.CPQRR015;

import java.util.ArrayList;
import java.util.List;

public class CPQRR015Mock implements CPQRR015 {
    @Override
    public Banks execute(String cliente) {
        List<BanksDatos> banksDatosList = new ArrayList<>();

        BanksDatos banksDatos1 = new BanksDatos();

        Banks banks = new Banks();
        banks.setUserName("David Suarez");
        banks.setState("ACTIVE");



        for(int i = 0; i < 99; i++){
            BanksDatos banksDatos = new BanksDatos();
            banksDatos.setName("BANCOLOMBIA");
            banksDatos.setNumber("76567786787");
            banksDatos.setCuatroXMil(false);

            banksDatosList.add(banksDatos);

            banks.setUserName("David Suarez");
            banks.setState("ACTIVE");
            banks.setBanksDatos(banksDatosList);
        }

        banksDatos1.setName("BBVA");
        banksDatos1.setNumber("1234545555");
        banksDatos1.setCuatroXMil(true);
        banksDatosList.add(banksDatos1);


        return banks;
    }
}
