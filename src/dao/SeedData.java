package dao;

import java.sql.SQLException;
import java.sql.Statement;

import model.ERegiaoNome;

public class SeedData extends ConnectDAO {

    public void inserirDados() {
        try {
            inserirRegioes();
            inserirPerguntas();
            inserirAlternativas();
            inserirGabaritos();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executarSQL(String sql) throws SQLException {
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            stmt.execute(sql);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    private void inserirRegioes() throws SQLException {
        for (ERegiaoNome regiao : ERegiaoNome.values()) {
            String sql = String.format("INSERT INTO regioes (id, nome) VALUES (%d, '%s')", regiao.ordinal() + 1, regiao.getNome());
            executarSQL(sql);
        }
    }


    private void inserirPerguntas() throws SQLException {
        String[] perguntas = {
            // Shurima
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o nome do imperador que fundou o Império de Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o Aspecto do Sol que governa Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual campeão é conhecido como \"o Ascendente\" de Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é a capital de Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o nome da ordem de guerreiros que juraram proteger o Império de Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Como Azir planeja restaurar Shurima à sua antiga glória?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é a relação entre Azir e Xerath?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem são os Guerreiros de Areia e qual é o seu papel em Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual campeão de Shurima é conhecido como \"o Profeta do Vazio\"?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o nome do ritual em Shurima que transforma humanos em Ascendentes?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Como Sivir é importante para a profecia de Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é a história por trás da ascensão de Renekton?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é Taliyah e como ela se conecta com Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('O que é o \"Coração de Shurima\" e por que ele é importante?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é a importância das Runas Globais em Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem traiu Azir, causando a queda de Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o papel das Serpentes de Areia em Shurima?', 3)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é a origem da maldição de Amumu, segundo a lenda, e como isso reflete sua eterna tristeza?', 3)",
                // Freljord
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o líder da tribo Avarosa em Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o nome da arma de Ashe em League of Legends?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é a tribo liderada por Sejuani em Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o guardião Ancestral de Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o título de Lissandra em Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o líder ancestral dos Ursine em Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é conhecido como coração de Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o título de Braum em Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o nome do evento sazonal em que Freljord é o tema principal em League of Legends?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o líder dos Frostguard em Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o nome da cidade subterrânea em Freljord onde Lissandra reside?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o título de Tryndamere em Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o título de Volibear em Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o líder dos Iceborn em Freljord?', 5)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o nome do torneio de lutas que ocorre periodicamente em Freljord, onde os mais poderosos competem?', 5)",
                // Demacia
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o atual rei de Demacia?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é a irmã de Garen?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o lema de Demacia?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o principal estrategista militar de Demacia?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é a relação entre Jarvan IV e Jarvan III?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o líder dos Sentinelas da Luz?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o nome da cidade-capital de Demacia?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o campeão conhecido como o Poder de Demacia?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o principal inimigo de Demacia?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é conhecida como Dama da Luz em Demacia?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o mestre de armas de Demacia?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('O que Demacia odeia e caça?', 4)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o título de Galio em Demacia?', 4)",
                // Ionia
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o líder espiritual de Ionia?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual é o título da Irelia em Ionia?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o irmão de Yasuo?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o atual líder da Ordem Kinkou em Ionia?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o principal inimigo de Ionia?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é conhecido como Punhos das Sombras em Ionia?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o nome da espada do Yasuo?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem utiliza um par de espadas como armas?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual a fonte de poder que Ionia utiliza?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem possui um caso de romance com Zed?', 1)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é o Olho do Crepúsculo?', 1)",
                // Águas de Sentina
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem comanda o navio “Cachalote” em Águas de Sentina?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem comanda tentáculos para lutar?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual a relação entre Gangplank e Miss Fortune?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o principal inimigo das Águas de Sentina?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é conhecida como a Caçadora de Recompensas em Águas de Sentina?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem é conhecido como Demoníaco em bilgewater?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Em quem Graves têm interesse romântico?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual a alcunha de Tahm Kench?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o bar mais famoso em Águas de Sentina?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual a relação entre Illaoi e Gangplank?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Qual o nome dos monstros que sacrificam pessoas para os monstros marinhos?', 2)",
                "INSERT INTO perguntas (descricao, id_regiao) VALUES ('Quem dá o poder a Illaoi?', 2)"
        };

        for (String pergunta : perguntas) {
            executarSQL(pergunta);
        }
    }

    private void inserirAlternativas() throws SQLException {
    String[] alternativas = {
        // Shurima
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Nasus', 1)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Xerath', 1)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Azir', 1)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Renekton', 1)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Diana', 2)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Leona', 2)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Azir', 2)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Rammus', 2)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Malzahar', 3)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Sivir', 3)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Azir', 3)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Taliyah', 3)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Icathia', 4)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Shurima Prime', 4)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Vekaura', 4)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Nashramae', 4)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ascendentes', 5)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Guerreiros de Areia', 5)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Discípulos de Nasus', 5)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Magos de Areia', 5)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Usando tecnologia hextec', 6)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Utilizando as habilidades de manipulação de areia', 6)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Aliando-se com os noxianos', 6)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Invocando a ajuda de Targon', 6)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Xerath é o mentor de Azir', 7)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Xerath é o escravo e amigo de Azir', 7)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Xerath é o irmão de Azir', 7)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Xerath é o inimigo antigo de Azir', 7)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Sacerdotes que veneram o sol', 8)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Soldados leais ao imperador Azir', 8)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Mercenários contratados por Shurima', 8)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Exploradores do deserto', 8)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Kha''Zix', 9)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Cho''Gath', 9)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Malzahar', 9)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Kassadin', 9)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ritual de Renascimento', 10)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ritual de Ascensão', 10)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ritual de Transcendência', 10)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ritual da Areia', 10)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Seu sangue é descendente direto da linhagem real de Azir', 11)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ela possui uma arma mágica essencial', 11)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ela pode invocar os Ascendentes', 11)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ela é a escolhida para liderar Shurima', 11)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ele foi escolhido pelo sol', 12)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ele derrotou Xerath em combate', 12)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ele foi corrompido durante a queda do império', 12)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ele é irmão de Nasus', 12)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Uma maga de fogo de Shurima', 13)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Uma maga de pedra de uma tribo nômade de Shurima', 13)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Uma arqueóloga que estuda Shurima', 13)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Uma guerreira protegendo Shurima', 13)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Um artefato que controla o clima de Shurima', 14)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Uma relíquia mágica contendo a essência do poder de Shurima', 14)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Uma cidade escondida em Shurima', 14)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Uma planta rara que cura doenças', 14)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Contêm conhecimento e poder místico', 15)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('São utilizadas para controlar o deserto', 15)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('São moedas de troca entre tribos', 15)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Servem como sinais para viajantes', 15)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Renekton', 16)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Xerath', 16)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Nasus', 16)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Malzahar', 16)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Proteger as tumbas reais', 17)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Guardar segredos antigos', 17)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Criar tempestades de areia', 17)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Símbolos de poder e guardiãs do deserto', 17)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ele foi traído por seus amigos, que o aprisionaram em uma tumba.', 18)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ele é um príncipe que foi traído e morto, condenado a vagar eternamente.', 18)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ele quebrou um antigo selo, liberando um espírito vingativo que o amaldiçoou.', 18)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ele foi rejeitado pelos deuses de Shurima, que o condenaram à solidão eterna.', 18)",

        // Freljord
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Sejuani', 19)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Lissandra', 19)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ashe', 19)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Tryndamere', 19)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Flecha da Ascensão', 20)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Arco de Gelo', 20)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Arco do Amanhecer', 20)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Fúria de Gelo', 20)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Avarosa', 21)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Winter’s Claw', 21)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Frostguard', 21)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Iceborn', 21)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Anivia', 22)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Udyr', 22)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Volibear', 22)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Bard', 22)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Rainha do Gelo', 23)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Vidente Congelada', 23)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Feiticeira do Gelo Negro', 23)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Dama da Neve', 23)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Nunu', 24)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Volibear', 24)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Rammus', 24)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Gragas', 24)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Gnar', 25)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Braum', 25)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Volibear', 25)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Tryndamere', 25)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Escudo do Norte', 26)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Protetor de Gelo', 26)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Quebra-Gelo', 26)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Colosso de Gelo', 26)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Inverno Congelante', 27)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Fúria Gélida', 27)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Calor do Gelo', 27)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ascensão Glacial', 27)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ashe', 28)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Lissandra', 28)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Sejuani', 28)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Trundle', 28)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Fortaleza da Noite', 29)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Picos Congelados', 29)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Cripta Gélida', 29)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Abismo Congelado', 29)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Rei Bárbaro', 30)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Senhor do Gelo', 30)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Lorde do Norte', 30)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Governante Glacial', 30)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Trovão do Gelo', 31)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Raios do Norte', 31)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Urso Celestial', 31)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Guardião da Tempestade', 31)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Sejuani', 32)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Lissandra', 32)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ashe', 32)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Trundle', 32)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Coliseu do Gelo', 33)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Arena Congelada', 33)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Valhalla Gelida', 33)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Guerra da Neve', 33)",

        // Demacia
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Garen', 34)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Jarvan IV', 34)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ashe', 34)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Trundle', 34)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Lux', 35)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Fiora', 35)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Quinn', 35)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Leona', 35)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Demacia: agora e para sempre!', 36)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Pela honra!', 36)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Pela glória!', 36)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Pela justiça!', 36)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Jarvan IV', 37)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Darius', 37)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Garen', 37)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Xin Zhao', 37)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Pai e Filho', 38)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Irmãos', 38)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Tio e Sobrinho', 38)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Avô e neto', 38)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Lucian', 39)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Vayne', 39)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Garen', 39)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Kayle', 39)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ilian', 40)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Valoran', 40)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Demacia City', 40)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Mandrake', 40)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Garen', 41)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Jarvan IV', 41)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Xin Zhao', 41)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Galio', 41)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Noxus', 42)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Freljord', 42)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Zaun', 42)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ionia', 42)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Lux', 43)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Leona', 43)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Kayle', 43)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Quinn', 43)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Xin Zhao', 44)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Fiora', 44)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Jarvan IV', 44)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Garen', 44)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Magia e Magos', 45)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Noxianos e Ionianos', 45)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Mostros do Vazio', 45)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Freljordanos', 45)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Colosso', 46)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Protetor', 46)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Guardião do Céus', 46)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Sentinela', 46)",

        // Ionia
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Karma', 47)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Irelia', 47)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Shen', 47)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Kennen', 47)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('A vanguarda das Lâminas', 48)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('A Guardiã Espiritual', 48)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('A Mestre das Lâminas', 48)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('A Dançarina das Lâminas', 48)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Yone', 49)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Zed', 49)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Shen', 49)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Talon', 49)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Shen', 50)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Akali', 50)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Kennen', 50)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Zed', 50)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Noxus', 51)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Demacia', 51)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Piltover', 51)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ilha das Sombras', 51)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Akali', 52)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Karma', 52)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Syndra', 52)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Irelia', 52)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Manamune', 53)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Filo Vento', 53)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ventania', 53)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Kashinji', 53)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Yona', 54)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Yasuo', 54)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Akali', 54)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Irelia', 54)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Magia espiritual', 55)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Runas Arcanas', 55)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Tecnologia Hextec', 55)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Alquimia', 55)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Syndra', 56)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Akali', 56)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Shen', 56)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ahri', 56)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Shen', 57)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ahri', 57)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Kennen', 57)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ryze', 57)",

        // Águas de Sentina
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Miss fortune', 58)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Gangplank', 58)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Graves', 58)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Pyke', 58)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Illaoi', 59)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Pyke', 59)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Tahm Kench', 59)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Twisted Fate', 59)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Rivais', 60)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Pai e Filha', 60)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Aliados', 60)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Amigos', 60)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ilha das Sombras', 61)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Noxus', 61)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ionia', 61)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Shurima', 61)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Miss Fortune', 62)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Illaoi', 62)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Vayne', 62)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Katarina', 62)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Tahm Kench', 63)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Pyke', 63)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Twisted Fate', 63)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Gangplank', 63)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Twisted Face', 64)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Miss Fortune', 64)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Illaoi', 64)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Gangplank', 64)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Rei do Rio', 65)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Demônio do Rio', 65)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Mestre do Rio', 65)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Demônio do lago', 65)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Toca do Sirinhão', 66)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('O Olho da Serpente', 66)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('O Barril Furado', 66)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('A Taverna do Marujo', 66)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Ex-amantes', 67)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Casados', 67)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Rivais', 67)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Amigos', 67)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Bruxas do mar', 68)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Serpentes', 68)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Serpentes de Sentina', 68)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Bruxas de Sentina', 68)",

        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Nagakabouros', 69)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Cthulhu', 69)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Kraken', 69)",
        "INSERT INTO alternativas (texto, id_pergunta) VALUES ('Umibozu', 69)"
    };

    for (String alternativa : alternativas) {
        executarSQL(alternativa);
    }
}

    private void inserirGabaritos() throws SQLException {
    	String[] gabaritos = {
    	        // Shurima
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (1, 3)", // Azir
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (2, 7)", // Azir
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (3, 11)", // Azir
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (4, 14)", // Shurima Prime
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (5, 18)", // Guerreiros de Areia
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (6, 22)", // Utilizando as habilidades de manipulação de areia
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (7, 26)", // Xerath é o escravo e amigo de Azir
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (8, 30)", // Soldados leais ao imperador Azir
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (9, 35)", // Malzahar
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (10, 38)", // Ritual de Ascensão
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (11, 41)", // Seu sangue é descendente direto da linhagem real de Azir
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (12, 47)", // Ele foi corrompido durante a queda do império
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (13, 50)", // Uma maga de pedra de uma tribo nômade de Shurima
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (14, 54)", // Uma relíquia mágica contendo a essência do poder de Shurima
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (15, 57)", // Contêm conhecimento e poder místico
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (16, 62)", // Xerath
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (17, 68)", // Símbolos de poder e guardiãs do deserto
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (18, 70)", // Ele é um príncipe que foi traído e morto, condenado a vagar eternamente.
    	        
    	        // Freljord
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (19, 75)", // Ashe
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (20, 79)", // Arco do Amanhecer
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (21, 82)", // Winter’s Claw
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (22, 85)", // Anivia
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (23, 91)", // Feiticeira do Gelo Negro
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (24, 94)", // Volibear
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (25, 100)", // Tryndamere
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (26, 101)", // Escudo do Norte
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (27, 106)", // Fúria Gélida
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (28, 110)", // Lissandra
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (29, 113)", // Fortaleza da Noite
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (30, 119)", // Lorde do Norte
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (31, 122)", // Raios do Norte
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (32, 126)", // Lissandra
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (33, 129)", // Coliseu do Gelo

    	        // Demacia
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (34, 134)", // Jarvan IV
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (35, 137)", // Lux
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (36, 141)", // Demacia: agora e para sempre!
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (37, 145)", // Jarvan IV
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (38, 149)", // Pai e Filho
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (39, 153)", // Lucian
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (40, 157)", // Ilian
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (41, 161)", // Garen
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (42, 165)", // Noxus
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (43, 169)", // Lux
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (44, 173)", // Xin Zhao
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (45, 177)", // Magia e Magos
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (46, 181)", // Colosso

    	        // Ionia
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (47, 185)", // Karma
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (48, 189)", // A vanguarda das Lâminas
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (49, 193)", // Yone
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (50, 197)", // Shen
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (51, 201)", // Noxus
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (52, 205)", // Akali
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (53, 209)", // Manamune
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (54, 213)", // Yone
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (55, 217)", // Magia espiritual
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (56, 221)", // Syndra
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (57, 225)", // Shen

    	        // Águas de Sentina
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (58, 229)", // Miss Fortune
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (59, 233)", // Illaoi
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (60, 237)", // Rivais
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (61, 241)", // Ilha das Sombras
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (62, 245)", // Miss Fortune
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (63, 249)", // Tahm Kench
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (64, 253)", // Twisted Fate
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (65, 257)", // Rei do Rio
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (66, 261)", // Toca do Sirinhão
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (67, 265)", // Ex-amantes
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (68, 269)", // Bruxas do mar
    	        "INSERT INTO gabaritos (id_pergunta, id_alternativa) VALUES (69, 273)"  // Nagakabouros
    	    };

        for (String gabarito : gabaritos) {
            executarSQL(gabarito);
        }
    }
}
