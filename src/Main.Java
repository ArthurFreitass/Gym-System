import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nGYM SYSTEM");
        System.out.println("==========");

        String optionUserStr = "0";
        int optionUser = 0;
        Scanner sc = new Scanner(System.in);

        // Salvar a informação dos usuários
        String [] nameStudents = new String[100];
        int [] ageStudents = new int[100];
        double [] weightStudents = new double[100];
        double [] heightStudents = new double[100];
        String [] levelStudent =  new String[100];
        String [] imcCategory = new String[100];
        double [] imcUsers = new double[100];

        // idadeStr, pesoStr, altStr

        String ageStr;
        String weightStr;
        String heightStr;

        // Contador de alunos

        int index = 0;
        boolean studentExists = false;

        while (optionUser != 5) {
            System.out.println("ESCOLHA UMA DAS OPÇÕES:");
            System.out.println("DIGITE [1] PARA CADASTRAR ALUNO");
            System.out.println("DIGITE [2] PARA LISTAR ALUNOS");
            System.out.println("DIGITE [3] PARA VER ESTATÍSTICAS");
            System.out.println("DIGITE [4] PARA BUSCAR ALUNOS POR NOME");
            System.out.println("DIGITE [5] PARA SAIR");
            System.out.println("==========================================");
            optionUserStr =  sc.nextLine();
            optionUser = Integer.parseInt(optionUserStr);

            if (optionUser == 5) {
                break;
            }

            for (int i = 0; i <= 20; i += 1) {
                System.out.println();
            }

            // Cadastro do aluno
            if (optionUser == 1) {
                System.out.println();
                System.out.println("OPÇÃO ESCOLHIDA [1] - CADASTRO DO ALUNO");
                System.out.println();
                System.out.println("PREENCHA OS DADOS DO ALUNO:");
                System.out.println("===========================");
                System.out.println();
                System.out.println("Digite o nome completo do aluno:");
                nameStudents[index] = sc.nextLine();

                // Idade
                System.out.println();
                System.out.println("Digite a idade do aluno:");
                ageStr = sc.nextLine();

                ageStudents[index] = Integer.parseInt(ageStr);

                if (ageStudents[index] < 0) {
                    System.out.println();
                    System.out.println("ERRO: Idade menor que zero!");
                    System.out.println();
                    continue;
                }

                // Peso
                System.out.println();
                System.out.println("Digite o peso do aluno: [KG]");
                weightStr = sc.nextLine();
                weightStudents[index] = Double.parseDouble(weightStr);

                if (weightStudents[index] <= 0) {
                    System.out.println("ERRO: Peso menor que zero!");
                    System.out.println();
                    continue;
                }

                // Altura
                System.out.println();
                System.out.println("Digite o altura do aluno: [M]");
                heightStr = sc.nextLine();
                heightStudents[index] = Double.parseDouble(heightStr);

                if (heightStudents[index] <= 0) {
                    System.out.println("ERRO: Altura menor que zero!");
                    System.out.println();
                    continue;
                }

                // Nivel
                System.out.println();
                System.out.println("Digite o nível atual do aluno: [Iniciante][Intermediário][Avançado]");
                levelStudent[index] = sc.next();

                levelStudent[index] = levelStudent[index].toLowerCase();

                if (levelStudent[index].equals("iniciante") || levelStudent[index].equals("intermediario") || levelStudent[index].equals("intermediário")
                        || levelStudent[index].equals("avançado")) {
                    index += 1;
                } else {
                    System.out.println("ERRO: Nível digitado inválido!");
                    System.out.println();
                    continue;
                }

                // Já salva a categoria dele

                    double imc = weightStudents[index - 1] / (heightStudents[index - 1] * heightStudents[index - 1]);
                    imcUsers[index - 1] = Math.round(imc);

                    if (imcUsers[index - 1] < 18.5) {
                        imcCategory[index - 1] = "Abaixo do peso";
                    } else if (imcUsers[index - 1] < 25) {
                        imcCategory[index - 1] = "Peso normal";
                    } else if (imcUsers[index - 1] < 30) {
                        imcCategory[index - 1] = "Sobrepeso";
                    } else if (imcUsers[index - 1] > 30) {
                        imcCategory[index - 1] = "Obesidade";
                    }

                // Pulando a linha
                sc.nextLine();
                for (int i = 0; i <= 10; i += 1) {
                    System.out.println();
                }
                studentExists = true;
                System.out.println("SUCESSO! Aluno "+ nameStudents[index - 1] +" CADASTRADO");
                System.out.println("=========================");
                System.out.println();
            }

            if (studentExists) {
                // Listagem de alunos
                if (optionUser == 2) {

                    for (int i = 0; i <= 10; i += 1) {
                        System.out.println();
                    }
                    System.out.println("OPÇÃO ESCOLHIDA - [2] = Listagem de alunos");
                    System.out.println("==========================================");
                    // Verificar se existe algum aluno cadastrado
                        for (int i = 0; i < index; i += 1) {
                            System.out.println();
                            System.out.println("DADOS DE CADA ALUNO:");
                            System.out.println();
                            System.out.println("NOME: "+ nameStudents[i]);
                            System.out.println("IDADE: "+ ageStudents[i]);
                            System.out.println("PESO: "+ weightStudents[i]);
                            System.out.println("ALTURA: "+ heightStudents[i]);
                            System.out.println("NÍVEL: "+ levelStudent[i]);
                            System.out.println("IMC: "+ imcUsers[i]);
                            System.out.println();
                        }
                }

                // Estatísticas
                if (optionUser == 3) {
                    for (int i = 0; i <= 10; i += 1) {
                        System.out.println();
                    }
                        System.out.println("OPÇÃO ESCOLHIDA [3] VER ESTATÍSTICAS");
                        System.out.println("====================================");
                        System.out.println();
                        System.out.println("ESTATÍSTICAS");
                        System.out.println();
                        System.out.println("Total de alunos: "+ index);

                        int sumAverage = 0;
                        double biggestWeight = 0;
                        double lowerWeight = weightStudents[0];
                        int countLevelBegginer = 0;
                        int countLevelIntermediary = 0;
                        int countLevelAdvanced = 0;

                        int countUnderweight = 0;
                        int countNormalweight = 0;
                        int countOverweight = 0;
                        int obesityWeight = 0;

                        for  (int i = 0; i < index; i += 1) {
                            sumAverage += ageStudents[i];

                            if (weightStudents[i] > biggestWeight) {
                                biggestWeight = weightStudents[i];
                            }

                            if (weightStudents[i] < lowerWeight) {
                                lowerWeight = weightStudents[i];
                            }

                            if (levelStudent[i].equals("iniciante")) {
                                countLevelBegginer++;
                            } else if (levelStudent[i].equals("intermediario") || levelStudent[i].equals("intemediário")) {
                                countLevelIntermediary++;
                            } else {
                                countLevelAdvanced++;
                            }

                            if (imcCategory[i].equals("Abaixo do peso")) {
                                countUnderweight++;
                            } else if (imcCategory[i].equals("Peso normal")) {
                                countNormalweight++;
                            } else if (imcCategory[i].equals("Sobrepeso")) {
                                countOverweight++;
                            } else {
                                obesityWeight++;
                            }
                        }

                        float averageAge = sumAverage / index;

                        System.out.println("Média de idade: "+ averageAge);
                        System.out.println("Aluno com maior peso: "+ biggestWeight);
                        System.out.println("Aluno com menor peso: "+ lowerWeight);
                        System.out.println("Quantidade de alunos iniciantes: "+ countLevelBegginer);
                        System.out.println("Quantidade de alunos intermediários: "+ countLevelIntermediary);
                        System.out.println("Quantidade de alunos avançados: "+ countLevelAdvanced);
                        System.out.println();
                        System.out.println("IMC - ESTATÍSTICAS");
                        System.out.println("==================");
                        System.out.println();
                        System.out.println("Quantidade de alunos abaixo do peso: " + countUnderweight);
                        System.out.println("Quantidade de alunos com peso normal: " + countNormalweight);
                        System.out.println("Quantidade de alunos com sobrepeso: " + countOverweight);
                        System.out.println("Quantidade com obesidade: " + obesityWeight);
                        System.out.println();

                }

                // Busca de alunos por nome
                if (optionUser == 4) {
                    for (int i = 0; i <= 10; i += 1) {
                        System.out.println();
                    }

                    System.out.println("OPÇÃO ESCOLHIDA [4] = BUSCA POR NOME");
                    System.out.println("====================================\n");

                    System.out.println("Digite o nome do aluno procurado: ");
                    String nameWanted = sc.nextLine();

                    boolean nameFound = false;
                    for (int i = 0; i < index; i += 1) {
                        if (nameWanted.equalsIgnoreCase(nameStudents[i])) {
                            nameFound = true;
                        }
                    }
                    if (nameFound) {
                        for (int i = 0; i < index; i += 1) {
                            System.out.println("\nALUNO ENCONTRADO!\n");
                            System.out.println("DADOS DO ALUNO: ");
                            System.out.println("=================");
                            System.out.println("Nome: " + nameStudents[i]);
                            System.out.println("IDADE: " + ageStudents[i]);
                            System.out.println("PESO: " + weightStudents[i]);
                            System.out.println("ALTURA: " + heightStudents[i]);
                            System.out.println("NÍVEL: " + levelStudent[i]);
                            System.out.println("IMC: " + imcUsers[i]);
                            System.out.println("=================\n\n");
                        }
                    } else {
                        System.out.println("\nALUNO NÃO ENCONTRADO!\n");
                        System.out.println("=====================");
                    }
                }

            } else {
                System.out.println("NENHUM ALUNO CADASTRADO!");
                System.out.println("========================");
                System.out.println();
            }
        }
        sc.close();
        System.out.println("\nVOCÊ SAIU COM SUCESSO!");
    }
}
