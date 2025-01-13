//Return a list of lists of the suggested products after each character of searchWord is typed.
//Example:Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
//Output: [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]
//**Approach**:Sort the Products Lexicographically: Ensures that suggestions are in the correct order.
//Initialize the Result List: To store suggestions after each character is typed.
//Iterate Through Each Character in searchWord: Building the current prefix.
//Use Binary Search to Find the Starting Index: Of products matching the current prefix.
//Collect Up to Three Matching Products: Starting from the found index.
//Handle Edge Cases: Such as fewer than three matching products.
//Return the Result List: Containing suggestions after each character is typed.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class SearchSuggestionsSystem {
    public static void main(String[] args) {
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchword = "mouse";
        String[] products2 = {"havana"};
        String searchWord2 = "havana";
        System.out.println("Test Case 1:");
        List<List<String>> result1 = suggestedProducts(products, searchword);
        System.out.println(result1);

        System.out.println("\nTest Case 2:");
        List<List<String>> result2 = suggestedProducts(products2, searchWord2);
        System.out.println(result2);
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchword) {
        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
        List<List<String>> result = new ArrayList<>();
        String prefix = "";
        for (char c : searchword.toCharArray()) {
            prefix += c;

            System.out.println(prefix);
            int start = lowerBound(products, prefix);
            List<String> suggestion = new ArrayList<>();
            for (int i = start; i < start + 3 && i < products.length; i++) {
                if (products[i].startsWith(prefix))
                    suggestion.add(products[i]);
                else {
                    break;
                }
            }
            result.add(suggestion);
        }
        return result;
    }


    public static int lowerBound(String[] prod,String prefix){
int low=0;
int high=prod.length;
while(low<high){
    int mid=low+(high-low)/2;
    if(prod[mid].compareTo(prefix)<0){
        low=mid+1;
    }else
        high=mid;
        }
return low;
    }
}
