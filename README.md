## Java Inventory Program

For the inventory system, it is important to know if it is necessary to request a certain product from your supplier according to the minimum quantity required.

It is requested to design an algorithm that:

● Read the list of codes.
● Read the two tables mentioned.
● Store the list in a vector and each table in an array.
Once the data is read:
● Indicate the codes of the products to be ordered, specifying the number of the branch. The site number corresponds to the row number in the table.
● The average of the quantities of each product in the warehouse and its respective code.

Note: to facilitate the reading process, read the codes on a single line separated by commas, read the quantity in warehouse table on a single line separating the rows by semicolons and numbers by space.

That is, for the example described above, the entries will be 3:
354 256 127
17 34 60;14 31 65;45 2 12;56 43 8
14 44 76;10 51 15;46 23 2;89 4 18

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.
