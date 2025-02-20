package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;



class PokemonTest {

    @Test
    void getNom() {
    }

    @Test
    void getUrlImage() {
    }

    @Test
    void getStats() {
    }

    @Test
    void estVainqueurContre() {
    }

    /*  Listes des tests:
     *  1- Pokemon1 gagne par attaque le pokemon2
     *  2- Pokemon1 gagne par défense le pokemon2
     *  3- Pokemon 2 gagne par attaque le pokemon1
     *  4- Pokemon 2 gagne par défense le pokemon1
     *  5- Pokemon 1 gagne quand attaque et défense sont égale que pokemon2
     * */

    /*
    *   Description : On test ici que la fonction estVainqueurContre() marche correctement.
    *   Le résultat attendu est True
    * */
    @Test
    void pokemon1_devrait_gagner_avec_attaque_superieur() {
        //GIVEN
        Pokemon pokemon1 = new ConstructeurDePokemon().avecAttaque(15).avecDefense(10).construire();
        Pokemon pokemon2 = new ConstructeurDePokemon().avecAttaque(13).avecDefense(10).construire();

        //WHEN
        boolean result = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(result).isTrue();
    }

    /*
     *   Description : On test ici que la fonction estVainqueurContre() marche correctement.
     *   Le résultat attendu est False
     * */
    @Test
    void pokemon1_devrait_gagner_avec_defense_superieur() {
        //GIVEN
        Pokemon pokemon1 = new ConstructeurDePokemon().avecAttaque(15).avecDefense(15).construire();
        Pokemon pokemon2 = new ConstructeurDePokemon().avecAttaque(15).avecDefense(10).construire();

        //WHEN
        boolean result = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(result).isTrue();
    }

    @Test
    void pokemon2_devrait_gagner_avec_attaque_superieur() {
        //GIVEN
        Pokemon pokemon1 = new ConstructeurDePokemon().avecAttaque(10).avecDefense(15).construire();
        Pokemon pokemon2 = new ConstructeurDePokemon().avecAttaque(15).avecDefense(10).construire();

        //WHEN
        boolean result = pokemon2.estVainqueurContre(pokemon1);

        //THEN
        assertThat(result).isTrue();
    }


    @Test
    void pokemon2_devrait_gagner_avec_defense_superieur() {
        //GIVEN
        Pokemon pokemon1 = new ConstructeurDePokemon().avecAttaque(15).avecDefense(10).construire();
        Pokemon pokemon2 = new ConstructeurDePokemon().avecAttaque(15).avecDefense(15).construire();

        //WHEN
        boolean result = pokemon2.estVainqueurContre(pokemon1);

        //THEN
        assertThat(result).isTrue();
    }

    @Test
    void pokemon1_devrait_gagner_avec_defense_et_attaque_egal() {
        //GIVEN
        Pokemon pokemon1 = new ConstructeurDePokemon().avecAttaque(15).avecDefense(15).construire();
        Pokemon pokemon2 = new ConstructeurDePokemon().avecAttaque(15).avecDefense(15).construire();

        //WHEN
        boolean result = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertThat(result).isTrue();
    }
}