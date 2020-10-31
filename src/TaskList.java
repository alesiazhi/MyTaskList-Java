import java.util.List;

public interface TaskList {

    /**
     * Metoda vlozi ukol do sesitu ukolu.
     * @param task ukol k vlozeni
     */
    void addTask(String task);

    /**
     * Metoda smaze ukol z daneho indexu. Pokud index neni platny (neexistuje), nic se neodstrani, ale program nezhavaruje.
     * @param taskIndex index ukolu, ktery ma byt odstranen.
     */
    void removeTask(int taskIndex);

    /**
     * Metoda vrati pocet ukolu v sesitu.
     * @return pocet ukolu
     */
    int getNumberOfTasks();

    /**
     * Metoda vrati seznam ukolu v sesitu.
     * @return seznam ukolu.
     */
    List<String> getAllTasks();

    /**
     * Metoda vrati ukol na danem indexu. Pokud index neni platny (neexistuje), vrati se null
     * @param taskIndex index ukolu
     * @return ukol
     */
    String getTask(int taskIndex);

    /**
     * Metoda zkontroluje, jestli dany ukol je uz v seznamu.
     * @param task ukol
     * @return true, pokud ukol existuje; false, pokud ne
     */
    boolean containsTask(String task);

    /**
     * Metoda zkontroluje, jestli dany ukol neexistuje v seznamu.
     * @param task ukol
     * @return true, pokud ukol neexistuje; false, pokud ano
     */
    boolean notContainsTask(String task);

    /**
     * Metoda prida vsechny ukoly ze seznamu ukolu ze vstupu do aktualiniho seznamu ukolu.
     * @param taskList seznam ukolu.
     */
    void addAllTasks(TaskList taskList);
}
