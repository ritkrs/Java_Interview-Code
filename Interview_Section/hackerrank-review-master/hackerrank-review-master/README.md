# hackerrank-review
Git repo for Mitrais 1st Java Hackerrank review

Q1. Consider a string, sentence, of space-separated words where each word is a substring consisting of English alphabetic letters only. 
We want to find the first word in sentence having a length which is both an even number and greater than or equal to the length of any other word of even length in the sentence.

For example, if sentence is "Time to write great code", then the word we're looking for is Time. 
While code and Time are of maximal length, Time occurs first. 
If sentence is "Write code for a great time", then the word we're looking for is code.

Function Description
Complete the function longestEvenWord. The function must return the word (string) that is the first occurrence of a string with maximal even number length. 
If there are no even length words, return 00.

longestEvenWord has the following parameter(s): sentence: a sentence string

Constraints
* 1 ≤ |sentence| ≤ 105
* The sentence string consists of spaces and characters in the ranges ascii[a-z, A-Z] only.




Q3. To solve this challenge, you are required to write an HTTP GET method to retrieve information from a movie database.

Function Description
Given a string substr, getMovieTitles ( static String[] getMovieTitles(String substr)  )must perform the following tasks:
1. Query https://jsonmock.hackerrank.com/api/movies/search/?Title=substr(replace substr).
2. Initialize the titles array to store total string elements. Store the Title of each movie meeting the search criterion in the titles array.
3. Sort titles in ascending order and return it as your answer.

The query response from the website is a JSON response with the following five fields: page : The current page.
- per_page : The maximum number of results per page.
- total : The total number of movies in the search result.
- total_pages : The total number of pages which must be queried to get all the results.
- data : An array of JSON objects containing movie information where the Title field denotes the title of the movie.

In order to get all results, you may have to make multiple page requests. 
To request a page by number, your query should read https://jsonmock.hackerrank.com/api/movies/search/?Title=substr&page=pageNumber , replacing substr and pageNumber.
