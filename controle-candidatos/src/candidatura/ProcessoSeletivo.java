package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
//        selecaoCandidatos();
//        imprimirSelecionados();
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado a vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGA PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGA PARA O CANDIDATO COM CONTRA PROPOST");
        } else {
            System.out.println("AGUARDAND O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero " + (indice + 1) + " eh " + candidatos[indice]);
        }

        // ou pode ser feito de uma outra forma, utilizando foreach
        System.out.println("Utilizando foreach");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        System.out.println(".....................................");
        System.out.println("# ENTRANDO EM CONTATO COM " + candidato);

        do {

            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println(" -> CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO CO O CANDIDATO " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        } else {
            System.out.println("NAO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + ". NUMERO DE TENTATIVAS: " + tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
