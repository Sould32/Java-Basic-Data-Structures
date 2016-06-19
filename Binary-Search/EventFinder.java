package binarySearch;

/**
 *  EventFinder object will find the HistoricEvent in the array provided
 *
 *  @author Alexandra LaMontagne alamon
 *  @author maellis1
 *  @version Nov 11, 2015
 */

public class EventFinder
{

    /**
     * uses binary search to search the region beginning at the specified
     * start index, up to and including the ending index
     * @param search a target HistoricEvent to search for
     * @param array an array of HistoricEvent objects to search in
     * @param start a starting index within the array
     * @param end an ending index within the array
     * @return int that indicates the position within the array where
     *  the value was found or if not found, the position of the smallest 
     *  value that is greater than the target value, if there is no value
     *  greater than the target value return end + 1  
     */
    public static int find(HistoricEvent search, HistoricEvent[] array, 
                            int start, int end)
    {    

        //special cases
        if (search.compareTo(array[end]) > 0)
        {
            return end + 1;
        }
       
        if (search.compareTo(array[start]) < 0)
        {
            return start;
        }
       
        if (end - start == 1)
        {
            int compare = search.compareTo(array[start]);
            if (compare <= 0)
            {
                return start;
            }
            else
            {
                return end;
            }
        }
  
        if (end <= start)
        {
            return start;
        }
     
        
        //divide and search
        int middle = start + (end - start) / 2;
        int compare = search.compareTo(array[middle]);
        if (compare < 0)
        {
            return find(search, array, start, middle);
        }
        else if (compare == 0)
        {
            return middle;
        }
        else
        {
            return find(search, array, middle + 1, end);
        }
    }

    /**
     * uses binary search to search the region
     * @param search a target HistoricEvent to search for
     * @param array an array of HistoricEvent objects to search in
     * @return int that indicates the position within the array where
     *  the value was found or if not found, the position of the smallest 
     *  value that is greater than the target value, if there is no value
     *  greater than the target value return end + 1 
     */    
    public static int find(HistoricEvent search, HistoricEvent[] array)
    {
        if (array.length == 0)
        {
            return 0;
        }
        else
        {
            return find(search, array, 0, array.length - 1);
        }
    }


}
