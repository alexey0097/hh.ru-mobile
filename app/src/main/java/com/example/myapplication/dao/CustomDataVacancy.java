package com.example.myapplication.dao;

import com.example.myapplication.R;
import com.example.myapplication.objects.Vacancy;

import java.util.LinkedList;
import java.util.List;

public class CustomDataVacancy {

    public static List<Vacancy> getAll() {

        List<Vacancy> list = new LinkedList<>();

        final String aboutComapny = "\"ОптиКом\" - крупная торговая компания, 19 лет на рынке упаковки и расходных материалов, приглашает на работу \"Менеджера по продажам в тендерный отдел\".";
        final String aboutObyas = "- Централизация процесса;\n" +
                "- Составление карт процессов со всеми развилками и шлюзами;\n" +
                "- Определение блоков процессов под замену автоматизированными инструментами;\n" +
                "- Запуск разработки инструментов в своей/других командах или переиспользование существующих инструментов/инструментов в разработке;\n" +
                "- Проработка 'узких мест';\n" +
                "- Согласование нового централизованного процесса со всеми участниками: бизнес, вспомогательные подразделения, команды разработки;\n" +
                "- Запуск нового функционала и проработка операционного контроля (аналитика, отчетность, действия).";
        final String aboutTrebov = "Soft:\n" +
                "- Системность;\n" +
                "- Нацеленность на результат;\n" +
                "- Сильные навыки коммуникатора и фасилитатора;\n" +
                "- Стратегическое мышление;\n" +
                "\n" +
                "Hard:\n" +
                "- Опыт анализа и построения процессов;\n" +
                "- Опыт руководства командой от 5 человек;\n" +
                "- Опыт централизации функций (ОЦО в преимуществе).";
        final String aboutUsl = "- Профессиональное обучение, семинары, тренинги, конференции;\n" +
                "- ДМС, сниженные ставки по кредитованию, программы лояльности для сотрудников;\n" +
                "- Самые инновационные, амбициозные проекты и задачи;\n" +
                "- Комфортный офис 'Sbergile Home' с просторными опенспейсами, лаундж зонами, кафе;\n" +
                "- Бесплатный фитнес-зал и групповые тренировки;\n" +
                "- Дисконт - программа от множества компаний - партнеров.";

        Vacancy vacancy1 = new Vacancy(
                1L,
                "ООО МАГНИТ",
                25000,
                "руб.",
                "Продавец",
                2,
                "среднее",
                R.drawable.vacancy1,
                "+79530190297",
                "company@mail.ru",
                "полный день",
                aboutComapny,
                aboutObyas,
                aboutTrebov,
                aboutUsl
        );

        Vacancy vacancy2 = new Vacancy(
                1L,
                "АО СИРЕНЬ",
                45000,
                "руб.",
                "Менеджер по подбору персонала",
                4,
                "высшее",
                R.drawable.vacancy2,
                "+79530190297",
                "company@mail.ru",
                "полный день",
                aboutComapny,
                aboutObyas,
                aboutTrebov,
                aboutUsl
        );

        Vacancy vacancy3 = new Vacancy(
                1L,
                "АО СИРЕНЬ",
                35000,
                "руб.",
                "Продавец",
                4,
                "высшее",
                R.drawable.vacancy3,
                "+79530190297",
                "company@mail.ru",
                "полный день",
                aboutComapny,
                aboutObyas,
                aboutTrebov,
                aboutUsl
        );

        Vacancy vacancy4 = new Vacancy(
                1L,
                "АО СИРЕНЬ",
                45000,
                "руб.",
                "Бухгалтер  ",
                7,
                "среднее",
                R.drawable.vacancy4,
                "+79530190297",
                "company@mail.ru",
                "полный день",
                aboutComapny,
                aboutObyas,
                aboutTrebov,
                aboutUsl
        );

        Vacancy vacancy5 = new Vacancy(
                1L,
                "АО СИРЕНЬ",
                50000,
                "руб.",
                "Директор магазина",
                15,
                "высшее",
                R.drawable.vacancy1,
                "+79530190297",
                "company@mail.ru",
                "полный день",
                aboutComapny,
                aboutObyas,
                aboutTrebov,
                aboutUsl
        );

        Vacancy vacancy6 = new Vacancy(
                1L,
                "АО СИРЕНЬ",
                15000,
                "руб.",
                "Уборщик",
                1,
                "начальное",
                R.drawable.vacancy2,
                "+79530190297",
                "company@mail.ru",
                "полный день",
                aboutComapny,
                aboutObyas,
                aboutTrebov,
                aboutUsl
        );

        Vacancy vacancy7 = new Vacancy(
                1L,
                "АО СИРЕНЬ",
                23000,
                "руб.",
                "Старший продавец",
                2,
                "высшее",
                R.drawable.vacancy3,
                "+79530190297",
                "company@mail.ru",
                "полный день",
                aboutComapny,
                aboutObyas,
                aboutTrebov,
                aboutUsl
        );

        Vacancy vacancy8 = new Vacancy(
                1L,
                "АО СИРЕНЬ",
                24000,
                "руб.",
                "Секретарь",
                1,
                "среднее",
                R.drawable.vacancy4,
                "+79530190297",
                "company@mail.ru",
                "полный день",
                aboutComapny,
                aboutObyas,
                aboutTrebov,
                aboutUsl
        );

        list.add(vacancy1);
        list.add(vacancy2);
        list.add(vacancy3);
        list.add(vacancy4);
        list.add(vacancy5);
        list.add(vacancy6);
        list.add(vacancy7);
        list.add(vacancy8);

        return list;

    }

}
