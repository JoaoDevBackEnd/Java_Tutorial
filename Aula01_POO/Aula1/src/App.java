

public class App {
    public static void main(String[] args) throws Exception {
        //Após criar uma Classe, Se cria um Objeto da qual derivara as informação da classe
        Celular model_001=new Celular();
        model_001.marca="APPLE";
        model_001.nome_modelo="IPHONE 3";
        model_001.ano_Fabricacao=2007;
        model_001.sistemaOperacional="IOS 3.1.3";
        model_001.tamanhoTela=3.5f;
        model_001.espacoArmazenamento=8;
        model_001.pixel_cam_traseira=2.0f;

         Celular model_002=new Celular();
        model_002.marca="APPLE";
        model_002.nome_modelo="IPHONE 3G";
        model_002.ano_Fabricacao=2008;
        model_002.sistemaOperacional="IOS 4.2.3";
        model_002.tamanhoTela=3.5f;
        model_002.espacoArmazenamento=8;
        model_002.pixel_cam_traseira=2.0f;

         Celular model_003=new Celular();
        model_003.marca="APPLE";
        model_003.nome_modelo="IPHONE 4";
        model_003.ano_Fabricacao=2010;
        model_003.sistemaOperacional="IOS 7.1.2";
        model_003.tamanhoTela=3.5f;
        model_003.espacoArmazenamento=16;
        model_003.pixel_cam_traseira=5.0f;
        model_003.pixel_cam_frontal= 0.3f;

         Celular model_004=new Celular();
        model_004.marca="APPLE";
        model_004.nome_modelo="IPHONE 5";
        model_004.ano_Fabricacao=2012;
        model_004.sistemaOperacional="IOS 10.3.4";
        model_004.tamanhoTela=4f;
        model_004.espacoArmazenamento=16;
        model_004.pixel_cam_traseira=8.0f;
        model_004.pixel_cam_frontal= 1.2f;

        System.out.println("Smarthphone marca: "+model_001.marca);
        System.out.println("Modelo: "+model_001.nome_modelo);
        System.out.println("Ano de Fabricação: "+model_001.ano_Fabricacao);
        System.out.println("Sistema Operacional: "+model_001.sistemaOperacional);
        System.out.println("Tamanho de Tela: "+model_001.tamanhoTela +" Polegadas");
        System.out.println("Espaço de Armazenamento: "+model_001.espacoArmazenamento+"GB");
        System.out.println("Câmera Traseira: "+model_001.pixel_cam_traseira+"MP");
        
    }
}
