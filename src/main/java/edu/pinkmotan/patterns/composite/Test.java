
package edu.pinkmotan.patterns.composite;

/**
 *
 * @author AlGore
 */
public class Test {

  public static void main(String[] args) {
    Personage firstMan = new Personage("OLD VALERIA");

    Personage argellaDurandon = new Personage("Argella Durrandon").addParent(firstMan);
    Personage orysBaratheon = new Personage("Orys Baratheon").addParent(firstMan);
    Personage rhaenysTargaryen = new Personage("Rhaenys Targaryen").addParent(firstMan);
    Personage aegon1Targaryen = new Personage("Aegon I Targaryen").addParent(firstMan);
    Personage visenyaBaratheon = new Personage("Visenya Targaryen").addParent(firstMan);

    Personage alyssaVelaryon = new Personage("Alyssa Velaryon");
    Personage aenys1Targaryen = new Personage("Aenys I Targaryen").addParent(rhaenysTargaryen).addParent(aegon1Targaryen);
    Personage rhaenaTargaryen = new Personage("Rhaena Targaryen").addParent(alyssaVelaryon).addParent(aenys1Targaryen);
    Personage aegon2Targaryen = new Personage("Aegon II Targaryen").addParent(alyssaVelaryon).addParent(aenys1Targaryen);
    Personage viserysTargaryen = new Personage("Viserys Targaryen").addParent(alyssaVelaryon).addParent(aenys1Targaryen);
    Personage jhaenaerys1Targaryen = new Personage("Jhaenaerys I Targaryen").addParent(alyssaVelaryon).addParent(aenys1Targaryen);
    Personage alysanneTargaryen = new Personage("Alysanne Targaryen").addParent(alyssaVelaryon).addParent(aenys1Targaryen);

    firstMan.displayAnchestors();
  }
}
