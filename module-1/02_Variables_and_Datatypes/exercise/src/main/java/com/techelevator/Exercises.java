package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoonsWoods = 3;
		int numberOfRaccoonsDinner = 2;
		int numberOfRaccoonsLeft = numberOfRaccoonsWoods - numberOfRaccoonsDinner;
		System.out.println(numberOfRaccoonsLeft);

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int finalNumberOfBees = numberOfFlowers - numberOfBees;
		System.out.println(finalNumberOfBees);

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int firstPigeon = 1;
		int secondPigeon = 1;
		int numberOfPigeons = firstPigeon + secondPigeon;
		System.out.println(numberOfPigeons);

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int firstOwls = 3;
		int nextOwls = 2;
		int numberOfOwls = firstOwls + nextOwls;
		System.out.println(numberOfOwls);

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversHome = 2;
		int beaversSwim = 1;
		int numberBeaversHome = beaversHome - beaversSwim;
		System.out.println(numberBeaversHome);

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int originToucans = 2;
		int newToucans = 1;
		int finalNumberOfToucans = originToucans + newToucans;
		System.out.println(finalNumberOfToucans);

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int moreSquirrelsThanNuts = squirrels - nuts;
		System.out.println(moreSquirrelsThanNuts);

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = 0.25;
		double dime = 0.10;
		double nickle = 0.05;
		double totalAmount = quarter + dime + (nickle * 2);
		System.out.println(totalAmount);

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierMuffins = 18;
		int macadamsMuffins = 20;
		int flanneryMuffins = 17;
		int totalMuffins = brierMuffins + macadamsMuffins + flanneryMuffins;
		System.out.println(totalMuffins);

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = 0.24;
		double whistle = 0.14;
		double totalForToys = yoyo + whistle;
		System.out.println(totalForToys);

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallow = 8;
		int smallMarshmallow = 10;
		int totalMarshmallow = largeMarshmallow + smallMarshmallow;
		System.out.println(totalMarshmallow);

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltSnow = 29;
		int brecknockSnow = 17;
		int totalSnow = hiltSnow - brecknockSnow;
		System.out.println(totalSnow);

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double moneyHiltHas = 10;
		double moneyHiltSpentOnToyTruck = 3;
		double moneyHiltSpentOnPencil = 2;
		double moneyLeftOver = moneyHiltHas - (moneyHiltSpentOnToyTruck+moneyHiltSpentOnPencil);
		System.out.println(moneyLeftOver);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marblesInJoshsCollection = 16;
		int numberOfMarblesJoshLost = 7;
		int joshsMarblesLeftOver = marblesInJoshsCollection - numberOfMarblesJoshLost;
		System.out.println(joshsMarblesLeftOver);

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int numberOfCurrentSeashells = 19;
		int numberOfSeashellsWanted = 25;
		int numberOfSeashellsNeeded = numberOfSeashellsWanted - numberOfCurrentSeashells;
		System.out.println(numberOfSeashellsNeeded);
        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradsBallons = 17;
		int redBallons = 8;
		int greenBallons = bradsBallons - redBallons;
		System.out.println(greenBallons);

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int numberOfBooksOnTheShelf = 38;
		int booksMartaPutOnTheShelf = 10;
		int totalBooksOnShelf = numberOfBooksOnTheShelf + booksMartaPutOnTheShelf;
		System.out.println(totalBooksOnShelf);

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numOfBeeLegs = 6;
		int numberOfBees = 8
		int totalNumOfBeeLegs = numOfBeeLegs * numberOfBees;
		System.out.println(totalNumOfBeeLegs);

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamConeCost = 0.99;
		double numberOfIceCreamCones = 2;
		double hiltsIceCreamCones = iceCreamConeCost * numberOfIceCreamCones;
		System.out.println(hiltsIceCreamCones);

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNeeded = 125;
		int rocksInHiltsPossession = 64;
		int hiltsGaardenRocks = rocksNeeded - rocksInHiltsPossession;
		System.out.println(hiltsGaardenRocks);

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltsMarbles = 38;
		int hiltsLostMarbles = 15;
		int hiltsMarblesLeft = hiltsMarbles - hiltsLostMarbles;
		System.out.println(hiltsMarblesLeft);

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int distanceOfConcertInMiles = 78;
		int howFarSistersDroveInMiles = 32;
		int hiltAndSistersMilesLeft = distanceOfConcertInMiles - howFarSistersDroveInMiles;
		System.out.println(hiltAndSistersMilesLeft);

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int minutesSpentShovelingSatMorning = 90;
		int minutesSpentShovelingSatAfternoon = 45;
		int hoursInMinutesShovelingSnow = minutesSpentShovelingSatMorning + minutesSpentShovelingSatAfternoon;
		System.out.println(hoursInMinutesShovelingSnow);

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double costOfOneHotdog = 0.50;
		double numberOfHotdogs = 6;
		double totalCostOfHotdogs = costOfOneHotdog * numberOfHotdogs;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltsNumberOfCents = 50;
		int costOfAPencil = 7;
		int numberOfPencilsHiltCanBuy = hiltsNumberOfCents / costOfAPencil;
		System.out.println(numberOfPencilsHiltCanBuy);

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int numberofOragneButterflies = 20;
		int numberOfRedButterflies = totalButterflies - numberofOragneButterflies;
		System.out.println(numberOfRedButterflies);

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double whatKateGaveToClerk = 1.00;
		double howMuchKatesCandyCost = 0.54;
		double amountOfChangeLeftOver = whatKateGaveToClerk - howMuchKatesCandyCost;
		System.out.println(amountOfChangeLeftOver);

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesInBackyeard = 13;
		int numberHeCouldPlant = 12;
		int numberOfTreesMarkWouldHave = treesInBackyeard + numberHeCouldPlant;
		System.out.println(numberOfTreesMarkWouldHave);

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysUntilJoySeesHerGrandma = 2;
		int hoursPerDay = 24;
		int numberOfHoursUntilJoySeesGrandma = daysUntilJoySeesHerGrandma * hoursPerDay;
		System.out.println(numberOfHoursUntilJoySeesGrandma);

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCOusinKimHas = 4;
		int piecesOfGumPerCousin = 5;
		int amountOfGumNeededForCousins = numberOfCOusinKimHas * piecesOfGumPerCousin;
		System.out.println(amountOfGumNeededForCousins);

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double amountOfMoneyDanHas = 3.00;
		double costOfCandyBar = 1.00;
		double dansLeftOverMoneyFromCandy = amountOfMoneyDanHas - costOfCandyBar;
		System.out.println(dansLeftOverMoneyFromCandy);

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnTheLake = 5;
		int amountOfPeopleInEachBoat = 3;
		int totalNumberOfPeopleOnTheBoats = boatsOnTheLake * amountOfPeopleInEachBoat;
		System.out.println(totalNumberOfPeopleOnTheBoats);

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legosEllenHad = 380;
		int lostLegos = 57;
		int numberOfEllensLegosLeft = legosEllenHad - lostLegos;
		System.out.println(numberOfEllensLegosLeft);

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int bakedMuffins = 35;
		int targetAmountOfMuffins = 83;
		int numberOfMuffinsThatNeedToBeBaked = targetAmountOfMuffins - bakedMuffins;
		System.out.println(numberOfMuffinsThatNeedToBeBaked);

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucysCrayons = 290;
		int amountMoreCrayonsThatSelfishWillyHas = willyCrayons - lucysCrayons;
		System.out.println(amountMoreCrayonsThatSelfishWillyHas);

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int stickersPerPage = 22;
		int amountOfStickersOnPages = stickersPerPage * stickersOnPage;
		System.out.println(amountOfStickersOnPages);

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakes = 100.0;
		double children = 8.0;
		double amountOfCupcakesPerKid = cupcakes / children;
		System.out.println(amountOfCupcakesPerKid);

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		int jars = 6;
		int cookiesNotInJar = gingerbreadCookies % jars;
		System.out.println(cookiesNotInJar);

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissantsPrepared = 59;
		int numberOfNeighbors = 8;
		int croissantsLeftOver = croissantsPrepared % numberOfNeighbors;
		System.out.println(croissantsLeftOver);

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesOnATray = 12;
		int totalNumberOfCookies = 276;
		int traysNeededToHoldOatmealCookies = totalNumberOfCookies / cookiesOnATray;
		System.out.println(traysNeededToHoldOatmealCookies);

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int bitsizedPretzles = 480;
		int servingsPerPerson = 12;
		int numberOfPretzelServings = bitsizedPretzles / servingsPerPerson;
		System.out.println(numberOfPretzelServings);

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCakesMinusTwoLeftAtHome = 51;
		int lemonCakesBoxesGivenAway = 3;
		int numberOfLemonCakesGivenAway = lemonCakesMinusTwoLeftAtHome / lemonCakesBoxesGivenAway;
		System.out.println(numberOfLemonCakesGivenAway);

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticksForBreakfast = 74;
		int servedEqually = 12;
		int numberOfCarrotsLeftOver = carrotSticksForBreakfast % servedEqually;
		System.out.println(numberOfCarrotsLeftOver);

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int numberOfTeddyBears = 98;
		int maxAmountPerShelf = 7;
		int numberOfShelvesFilledWithTeddyBears = numberOfTeddyBears / maxAmountPerShelf;
		System.out.println(numberOfShelvesFilledWithTeddyBears);

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesPerAlbum = 20;
		int totalPictures = 480;
		int numberOfPhotoAlbumsNeeded = totalPictures / picturesPerAlbum;
		System.out.println(numberOfPhotoAlbumsNeeded);

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int numberOfTradingCards = 94;
		int maximumCardsPerBox = 8;
		int numberOfBoxesFilled = numberOfTradingCards % maximumCardsPerBox;
		System.out.println(numberOfBoxesFilled);

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksToBeDistributed = 210;
		int numberOfShelves = 10;
		int booksPerShelf = booksToBeDistributed / numberOfShelves;
		System.out.println(booksPerShelf);

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double bakedCroissant = 17.0;
		double numberOfGuests = 7.0;
		double croissantsPerPerson = bakedCroissant / numberOfGuests;
		System.out.println(croissantsPerPerson);

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double billsHourlyRate = (12 * 14) / 2.15;
		double jillsHourlyRate = (12 * 14) / 1.90;
		double hourlyRatesSum = billsHourlyRate + jillsHourlyRate;
		double wallsDividedByHourlyRate = (12 * 14) / hourlyRatesSum;
		double timeToPaintFiveRooms = wallsDividedByHourlyRate * 5;
		System.out.println(timeToPaintFiveRooms);

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String middleName = " B.";
		String lastName = "Hopper";
		String fullName = lastName + ", " + firstName + middleName;
		System.out.println(fullName);

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double milesAlreadyTravelled = 537.0;
		double totalMilesToTravel = 800.0;
		double decimalPercentageForTripCompletion = milesAlreadyTravelled / totalMilesToTravel;
		int actualPercentage = (int)(decimalPercentageForTripCompletion * 100); //times by 100 to get int percentage
		System.out.println(actualPercentage);
	}

}
