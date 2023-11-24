package padroescomportamentais.templatemethod;

public class FuncionarioGerente extends Funcionario {

    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void promover() {
        System.out.println("Funcionário " + this.getNome() + " promovido por gerente");
    }

    public void demitir() {
        System.out.println("Funcionário " + this.getNome() + " demitido por gerente");
    }
}