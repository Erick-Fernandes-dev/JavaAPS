package br.ufpb.dcx.rodrigor.atv.composite.rede;

import java.util.ArrayList;
import java.util.List;

public class ElementoRedeComposto implements ElementoRede {

    private List<ElementoRede> componentes = new ArrayList<ElementoRede>();

    public ElementoRedeComposto(String nome, String ip, List<ElementoRede> componentes) {
    }

    public void add(ElementoRede elementoRede){
        this.componentes.add(elementoRede);
    }


    @Override
    public String getNome() {

        String nomes = "";

        for (ElementoRede elementoRede : componentes) {
            if (elementoRede.getNome() != null) {
                nomes = elementoRede.getNome();
                return nomes;
            }
        }

        return nomes;
    }

    @Override
    public String getIp() {

        String ips = "";

        for (ElementoRede elementoRede : componentes) {
            if (elementoRede.getIp() != null) {
                ips = elementoRede.getIp();
                return ips;
            }
        }
        return ips;
    }
}
