public class AlunoEnsinoSuperior extends Pessoa {
    double teste, prova;

    double getMedia() {
        return (teste + prova*2)/3;
    }
}
