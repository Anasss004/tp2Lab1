## Overview

Ce projet illustre le principe de l'**Inversion de Contrôle (IoC)** et de l'**Injection de Dépendances (DI)** en Java via l'API Reflection et un fichier de configuration externe (`config.txt`).

Le système permet de changer dynamiquement l'implémentation de la couche DAO à l'exécution, sans modifier ni recompiler le code métier (`MetierImpl`).

---

## Project Structure

```text
├── config.txt
├── screen1.png
├── screen2.png
└── src/
    ├── dao/
    │   ├── IDao.java
    │   ├── DaoImpl.java
    │   └── DaoImpl2.java
    ├── metier/
    │   ├── IMetier.java
    │   └── MetierImpl.java
    └── presentation/
        └── Presentation2.java
```

---

## Execution Instructions

### 1. Compilation des sources

```bash
javac -d out src/dao/*.java src/metier/*.java src/presentation/*.java
```

### 2. Exécution du programme

```bash
java -cp out presentation.Presentation2
```

---

## Demonstrations & Screenshots

### 1. Execution with `DaoImpl`

Configuration dans `config.txt` :

```text
dao.DaoImpl
metier.MetierImpl
```

<img width="1142" height="187" alt="4" src="https://github.com/user-attachments/assets/4b9ceac2-cce0-4bf3-8758-1a9cc630bf96" />

---

### 2. Execution with `DaoImpl2`

Configuration dans `config.txt` :

```text
dao.DaoImpl2
metier.MetierImpl
```

<img width="1097" height="241" alt="5" src="https://github.com/user-attachments/assets/298596ef-9663-4fd4-98c6-e6f27bb765df" />
