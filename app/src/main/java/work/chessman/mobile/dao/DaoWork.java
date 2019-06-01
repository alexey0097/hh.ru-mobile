package work.chessman.mobile.dao;

import android.database.sqlite.SQLiteDatabase;
import work.chessman.mobile.objects.Work;

import java.util.List;

/**
 * Интерфейс осуществляющий операции с таблицей в базе данных.
 *
 * @author Земцов Алексей Владимирович
 * @version 1.7
 */
public interface DaoWork {

    /**
     * Метод осуществляющий создание таблицы в базе данных.
     *
     * @param dataBase - передаваемая база данных, в которой
     * будет реализовываться создание текущей таблицы.
     */
    void createTable(SQLiteDatabase dataBase);

    /**
     * Метод осуществляющий удаление таблицы в базе данных.
     *
     * @param dataBase - передаваемая база данных, в которой
     * будет реализовываться удаление текущей таблицы.
     */
    void dropTable(SQLiteDatabase dataBase);

    /**
     * Метод осуществляющий вставку объекта {@link Work} в базу данных.
     *
     * @param work - объект предназначенный для вставки.
     * @param dataBase - передаваемая база данных, в которой
     * будет реализовываться вставка объекта в текущуюю таблицу.
     */
    void insert(Work work, SQLiteDatabase dataBase);

    /**
     * Метод осуществляющий поиск всех объектов {@link Work} в базе данных.
     *
     * @param dataBase - передаваемая база данных, в которой
     * будет реализовываться поиск объектов в текущей таблице.
     * @return {@link List<Work>} содержащий все объекты {@link Work} в базе данных.
     */
    List<Work> findAll(SQLiteDatabase dataBase);
}
