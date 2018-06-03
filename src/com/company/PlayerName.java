package com.company;

public class PlayerName {
    String []names={"Kelli Reyes", "Salvador Norris", "Diana Bridges", "Pamela Washington", "Audrey Boyd", "Elizabeth Mathis", "Darlene Poole", "Ryan Hunt", "Dixie Schultz", "Crystal Harper", "Gayle Little", "Tasha Mckenzie", "Johnathan Cox", "Darnell Tran", "Kristin Alvarez", "Courtney Bailey", "Kayla Rodriquez", "Monica Thornton", "Bennie Gross", "Marie Quinn", "Harry Rodgers", "Evan Barker", "Chelsea Howell", "Travis Parks", "Nelson Hudson", "Krystal Rivera", "Luke Burns", "Ruben Carpenter", "Ernest Ross", "Mitchell Burton", "Dan Robinson", "Elsa Parker", "Susan Todd", "Elena Romero", "Rodolfo Figueroa", "Gayle Poole", "Myrtle Armstrong", "Alexander Murphy", "Mildred Mills", "Lawrence Manning", "Tara Newman", "Alvin Hunter", "Tabitha Norris", "Annie Saunders", "Gloria Owens", "Salvatore Mitchell", "Julie Jones", "Archie Patrick", "Nellie Palmer", "Stephanie Adkins", "Catherine Graham", "Opal Wood", "Judy Park", "Lewis Morrison", "Kelvin Pena", "Jodi Norris", "Angelina Gonzalez", "Milton Larson", "Orlando Rivera", "Duane Bryan", "Adam Meyer", "Dwight Anderson", "Alicia Burton", "Angie Diaz", "Randolph Scott", "Christine Colon", "Sabrina Caldwell", "Kathleen Roberts", "Cody Fox", "Dora Norris", "Carlos Willis", "Traci Abbott", "Kim Hale", "Sara Robbins", "Willard Schmidt", "Erica Bennett", "Ernest Alexander", "Vanessa Blake", "Lindsay Maldonado", "Courtney Brock", "Terry Banks", "Lorenzo Barker", "Pam Brady", "Eloise Phillips", "Luis Boone", "Dean Dean", "Devin Stevenson", "Trevor Haynes", "Lana Olson", "Tricia Cox", "Angie Beck", "Angelo Mathis", "Felix Wilson", "Roderick Maxwell", "Barry Carlson", "Sheri Stevens", "Arnold Johnson", "Owen Morton", "Carl Torres", "Brent Chambers"};
    String name;
    RandomNumber randomnumber;
    public PlayerName()
    {
        randomnumber = new RandomNumber();
        name=names[(Math.abs(randomnumber.createRandomNumber()))%100];
    }
}
