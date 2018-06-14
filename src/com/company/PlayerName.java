package com.company;

public class PlayerName {
    String []names={"Clyde Ingram" ,"Janice Rogers" ,"June Rodriguez" ,"Cathy Sandoval" ,"Melody Poole" ,"Heather Carr" ,"Courtney Pratt" ,"Arlene Williamson" ,"Kristy Perkins" ,"Amos Pena" ,"Kenneth Myers" ,"Genevieve Wood" ,"Edgar Cobb" ,"Christine Barker" ,"Horace Schmidt" ,"Silvia Price" ,"Thomas Fox" ,"Roberta Phillips" ,"Kayla Walters" ,"Iris Huff" ,"Eugene Manning" ,"Tonya Duncan" ,"Melanie Reid" ,"Ernestine Mack" ,"Kim May" ,"Marjorie Wheeler" ,"Terence Lloyd" ,"Guillermo Moreno" ,"Pat Richards" ,"Viola Kelly" ,"Terrance Thompson" ,"Sherman Webb" ,"Alberta Nelson" ,"Verna Thornton" ,"Ismael Saunders" ,"Marc Bishop" ,"Catherine Fowler" ,"Leah Patterson" ,"Kendra Lucas" ,"Gregory Lewis" ,"Dana Miller" ,"Oscar Owen" ,"Anthony Robinson" ,"Tracy Montgomery" ,"George Becker" ,"Earnest Rodriquez" ,"Cecilia Robertson" ,"Ralph Greer" ,"Helen Webster" ,"Misty Rivera" ,"Deborah Burke" ,"Stephanie Cannon" ,"Grady Christensen" ,"Olive Hayes" ,"Amy Ross" ,"Whitney Mason" ,"Kerry Ramsey" ,"Jeanette Greene" ,"Merle Maldonado" ,"Armando Byrd" ,"Leroy Evans" ,"Jennie Harrison" ,"Bonnie Sherman" ,"Marian Stephens" ,"Myra Santiago" ,"Marcos Hogan" ,"Drew Long" ,"Deanna Willis" ,"Candice Oliver" ,"Aaron Watson" ,"Carlos Castro" ,"Henry Cummings" ,"Tony Higgins" ,"Paul Lindsey" ,"Sally Tate" ,"Thelma Dixon" ,"Gordon Santos" ,"Cora Stokes" ,"Andre Dawson" ,"Clint Neal" ,"Randolph Young" ,"Duane Flowers" ,"Maurice Norris" ,"Darrell Valdez" ,"Joyce Diaz" ,"Kenny Hubbard" ,"Sandra Welch" ,"Jennifer Reeves" ,"Stephen Fleming" ,"Harvey Simmons" ,"Clay Joseph" ,"Celia Powell" ,"Martin Quinn" ,"Alyssa Stanley" ,"Darryl Farmer" ,"Roxanne Thomas" ,"Kurt Nichols" ,"Carmen Allison" ,"Laura Daniel" ,"Ira Wilson"};
    RandomNumber randomnumber;
    public String createPlayerName()
    {
        randomnumber = new RandomNumber();
        return names[(Math.abs(randomnumber.createRandomNumber()%100))];
    }
}
