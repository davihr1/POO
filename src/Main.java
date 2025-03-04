import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();

        alunoEnsinoMedio.nome = "Jose";
        alunoEnsinoMedio.teste = 8;
        alunoEnsinoMedio.prova = 9;

        alunoEnsinoSuperior.nome = "Davi";
        alunoEnsinoSuperior.teste = 10;
        alunoEnsinoSuperior.prova = 8;

        out.println("Aluno do ensino medio: ");
        out.println("Nome: " + alunoEnsinoMedio.nome);
        out.println("Média: " + alunoEnsinoMedio.getMedia());

        out.println("Aluno do ensino Superior: ");
        out.println("Nome: " + alunoEnsinoSuperior.nome);
        out.println("Média: " + alunoEnsinoSuperior.getMedia());
    }
}