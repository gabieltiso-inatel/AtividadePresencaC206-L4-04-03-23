public class Posto {
    public double calculaPrecoPago(String tipoCombustivel, double litrosVendidos) {
       double litroGasolina = 6.0;
       double litroAlcool = 4.9;

       double valorTotal = 0;
       double porcentagemSelecionada, precoCombustivelSelecionado;

       if(tipoCombustivel.equals("G")) {
           precoCombustivelSelecionado = litroGasolina;
           if(litrosVendidos <= 20) {
               porcentagemSelecionada = 0.96;
           } else {
               porcentagemSelecionada = 0.94;
           }
       } else if(tipoCombustivel.equals("A")) {
           precoCombustivelSelecionado = litroAlcool;
           if(litrosVendidos <= 20) {
               porcentagemSelecionada = 0.97;
           } else {
               porcentagemSelecionada = 0.95;
           }
       } else {
            System.out.println("Esse tipo de combustível não existe");
            return -1;
       }

       for(int i = 0; i < litrosVendidos; i++) {
           valorTotal += (precoCombustivelSelecionado * porcentagemSelecionada);
       }

       return valorTotal;
    }
}
