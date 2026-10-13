package dao;

/**
 * Deuxième implémentation concrète de IDao.
 * Simule une source de données différente (ex: Web Service, API distante ou Capteur IoT).
 */
public class DaoImpl2 implements IDao {

    @Override
    public double getValue() {
        /* Simulation d'une deuxième source de données */
        System.out.println("-> [DaoImpl2] Récupération de la donnée depuis un Web Service / API...");
        return 250.0;
    }
}