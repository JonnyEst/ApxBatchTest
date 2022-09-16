package com.bbva.cpqr.dto.datos;

import java.util.List;

public class ListPersonaOut {

    private List<PersonaOut> personaOutList;

    public List<PersonaOut> getPersonaOutList() {
        return personaOutList;
    }

    public void setPersonaOutList(List<PersonaOut> personaOutList) {
        this.personaOutList = personaOutList;
    }

    @Override
    public String toString() {
        return personaOutList.toString();
    }
}
