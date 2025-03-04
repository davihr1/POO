import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        Professor professor = new Professor();

        alunoEnsinoMedio.setNome("Davi Favaro");
        alunoEnsinoMedio.teste = 9;
        alunoEnsinoMedio.prova = 10;

        out.println(alunoEnsinoMedio.getNome());
        out.println(alunoEnsinoMedio.getMedia());

        professor.setNome("Oswaldo");
        professor.setSalario(2000);

        out.println(professor.getNome());
        out.println(professor.getInss());
        out.println(professor.getSalarioLiquido());
    }
}