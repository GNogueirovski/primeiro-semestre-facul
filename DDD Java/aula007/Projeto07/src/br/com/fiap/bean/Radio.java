package br.com.fiap.bean;

public class Radio {
    //atributo
    private int volume;
    private float estacao;
    //metodos getter/setter

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        try {
            if(volume >= 0 && volume <= 100){
                this.volume = volume;
            }else{
                throw new Exception("Volume fora da faixa permitida! (min=0 e max=100)");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        this.volume = volume;
    }

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        try {
            if (estacao >= 80.0 && estacao <= 105.0){
                this.estacao = estacao;
            } else {
                throw new Exception("Estação fora da sintonia (min=80.0 ate max=105.0");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //metodos da classe
    public void aumentarVolume(){
        if(volume < 100){
            volume ++;
        }
    }

    public void diminuirVolume(){
        if(volume > 0){
            volume --;
        }
    }
}
