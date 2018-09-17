/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ASUS
 */
public class MainBola {
  public static void main(String[] args)  {
      double Jarijari = 14;
      Bola objekbola = new Bola(7);
      objekbola.showDiameter();
      objekbola.showLuasPermukaan();
      objekbola.showVolume();
      objekbola.setJarijari(Jarijari);//manipulasi dengan variabel jari jari yang dibuat
      objekbola.showDiameter();
      objekbola.showLuasPermukaan();
      objekbola.showVolume();
  }
}
