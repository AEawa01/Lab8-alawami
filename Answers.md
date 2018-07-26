Try using a TreeMap instead of a HashMap. Does this make any difference?
Answer:
---------
TreeMap sorts the map by its key. But In our case we have to sort the values of the map.
So, In our case, there is no difference of using TreeMap instead of a HashMap.


What happens if you invoke countWords multiple times for different String iterators?
Answer:
---------
If you invoke countWords multiple times for different String iterators, It will append the strings to the map.


What crucial role does the Iterator abstraction play in making WordCounter testable?
Answer:
---------
Iterator abstraction is used to iterate over collection and add data easily to map. 

