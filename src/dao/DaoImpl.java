package dao;

public class DaoImpl implements IDao {

    @Override
    public double getValue() {
        /* Simulation de récupération de données (ex: Base de données / API) */
        System.out.println("Version Base de données / Production");
        return 100.0;
    }
}