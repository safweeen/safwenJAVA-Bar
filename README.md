
# Gestion d'Employés : Prosits 9 à 12

## Description

Ce module enrichit le projet pour inclure un système de gestion des employés et des départements, intégrant des fonctionnalités avancées telles que les lambdas et les streams. Les concepts abordés incluent :

- Gestion des employés et des départements
- Utilisation de HashSet et HashMap pour les collections
- Tri et filtrage avec TreeSet et TreeMap
- Fonctions lambda et API Stream

## Fonctionnalités

### Gestion des employés et des départements : Prosit 9 à 11
- Ajout, recherche et suppression d'employés.
- Gestion des départements avec HashSet et tri via TreeSet.
- Affectation des employés aux départements grâce à HashMap.
- Tri des employés et départements à l'aide de TreeMap.

### Gestion des étudiants avec lambdas et streams : Prosit 12
- Affichage conditionnel des étudiants selon des prédicats.
- Extraction des noms des étudiants en une chaîne formatée.
- Création dynamique d'étudiants via un fournisseur (Supplier).
- Tri des étudiants avec un comparateur (Comparator).
- Conversion de listes en flux (Stream).

## Structure du Projet : Prosits 9 à 12

- `src/tn/esprit/gestionemployes/entities` : Contient les classes principales (Employe, Departement, Etudiant).
- `src/tn/esprit/gestionemployes/management` : Contient les interfaces (IGestion, IDepartement, Management) et leurs implémentations.
- `src/tn/esprit/gestionemployes/main` : Contient la classe Main pour tester toutes les fonctionnalités.

## Liens vers les Prosits

Chaque Prosit contient des instructions spécifiques ayant contribué au développement de ce module. Consultez la branche correspondante pour chaque :

- **Prosit 9** : Gestion des employés avec une structure ArrayList. [Lien Prosit 9](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit9)
- **Prosit 10** : Gestion des départements avec HashSet et tri avec TreeSet. [Lien Prosit 10](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit10)
- **Prosit 11** : Affectation des employés aux départements avec HashMap et tri via TreeMap. [Lien Prosit 11](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit11)
- **Prosit 12** : Gestion des étudiants avec lambdas et streams. [Lien Prosit 12](https://github.com/safweeen/safwenJAVA-Bar/tree/prosit12)

## Concepts Clés Utilisés

### Gestion des Employés et Départements
- Utilisation de collections avancées (ArrayList, HashSet, HashMap) pour implémenter les fonctionnalités.
- Tri et filtrage avec TreeSet et TreeMap.
- Respect des bonnes pratiques d'encapsulation et de validation en redéfinissant les méthodes (toString, equals, etc.).

### Programmation Fonctionnelle
- Utilisation des lambdas et des streams pour une manipulation dynamique des données (Predicate, Consumer, Function).
- Application des paradigmes fonctionnels dans les projets de gestion d'étudiants.

## Scripts Disponibles

Dans le répertoire du projet, vous pouvez exécuter :

### Tests
Testez manuellement les fonctionnalités suivantes :
- Gestion des employés et départements.
- Affectation et tri avec HashMap et TreeMap.
- Affichage et manipulation des étudiants avec lambdas et streams.

### Compilation (Build)
Étant donné qu'il s'agit d'un projet Java pur, il n'y a pas de processus de build complexe comme dans les projets React ou Node.js. La simple étape de compilation avec `javac` est suffisante.

## Auteur

- Safwen HABOUBI : Diplômé en science informatique

## Licence

Ce projet est open source et peut être librement modifié et redistribué.

### Notes Importantes
- Veillez à tester chaque module dans sa branche respective.
- Le projet est conçu pour être exécuté localement via une JVM compatible.

---

