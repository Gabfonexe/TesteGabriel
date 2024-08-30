package Testes;

import java.util.ArrayList;
import java.util.List;

public class TesteQuatro extends DistribuidoraImplement {

  // Dado o valor de faturamento mensal de uma distribuidora, detalhado por
  // estado:
  // • SP – R$67.836,43
  // • RJ – R$36.678,66
  // • MG – R$29.229,88
  // • ES – R$27.165,48
  // • Outros – R$19.849,53
  // Escreva um programa na linguagem que desejar onde calcule o percentual de
  // representação que cada estado teve dentro do valor total mensal da
  // distribuidora.
  public static void main(String[] args) {

    TesteQuatro teste = new TesteQuatro();
    System.out.print("Valor Total: ");
    System.out.println(teste.total() + "\n");

    System.out.println("Porcentagem Por Estado: " + "\n");

    for (int i = 0; i < 5; i++) {

      System.out.print(teste.listaEstados().get(i) + " - ");
      System.out.printf("%.2f  " + "\n", teste.percentualPorEstado().get(i));

    }

  }

}

interface DistribuidoraInterface {

  Double total();

  List<Double> percentualPorEstado();

  List<String> listaEstados();
}

class DistribuidoraImplement implements DistribuidoraInterface {

  private double sp = 67836.43;
  private double rj = 36678.66;
  private double mg = 29229.88;
  private double es = 27165.48;
  private double outros = 19849.53;
  // Não irei realizar os Setters, valores estáticos

  public DistribuidoraImplement() {
  }

  public double getSp() {
    return sp;
  }

  public double getRj() {
    return rj;
  }

  public double getMg() {
    return mg;
  }

  public double getEs() {
    return es;
  }

  public double getOutros() {
    return outros;
  }

  public DistribuidoraImplement(double sp, double rj, double mg, double es, double outros) {
    this.sp = sp;
    this.rj = rj;
    this.mg = mg;
    this.es = es;
    this.outros = outros;
  }

  @Override
  public Double total() {
    return sp + rj + mg + es + outros;
  }

  @Override
  public List<Double> percentualPorEstado() {
    double porcentRJ = (rj * 100) / total();
    double porcentSP = (sp * 100) / total();
    double porcentMG = (mg * 100) / total();
    double porcentES = (es * 100) / total();
    double porcentOutros = (outros * 100) / total();

    List<Double> lista = new ArrayList<>();
    lista.add(porcentRJ);
    lista.add(porcentSP);
    lista.add(porcentMG);
    lista.add(porcentES);
    lista.add(porcentOutros);
    return lista;
  }

  @Override
  public List<String> listaEstados() {
    String rj = "Rio de Janeiro";
    String sp = "São Paulo";
    String mg = "Minas Gerais";
    String es = "Espírito Santo";
    String outros = "Outros";

    List<String> lista = new ArrayList<>();
    lista.add(rj);
    lista.add(sp);
    lista.add(mg);
    lista.add(es);
    lista.add(outros);
    return lista;
  }
}
