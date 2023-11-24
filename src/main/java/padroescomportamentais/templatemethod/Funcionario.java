package padroescomportamentais.templatemethod;

public abstract class Funcionario {

    private int contrato;
    protected String nome;
    private float salarioBase;

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método Template
    public final String getInfo() {
        return getTipo() + "{" +
                "contrato=" + this.contrato +
                ", nome='" + this.nome + '\'' +
                ", salario=" + this.calcularSalario() +
                '}';
    }

    // Método Template
    public final float calcularSalario() {
        return this.salarioBase + this.calcularBonus();
    }

    // Método abstrato que será implementado pelas subclasses
    protected abstract float calcularBonus();

    public String getTipo() {
        return "Funcionário";
    }
}
