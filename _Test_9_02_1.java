package cn.it.jindian;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;


	public class _Test_9_02_1 {

		public void sort(String[] array){
			Hashtable<String, LinkedList<String>> hashtable = new Hashtable<String, LinkedList<String>>();
			
			 for (String string : array) {
				String key = sortChars(string);
				if (! hashtable.containsKey(key)) {
					hashtable.put(key, new LinkedList<String>());
				}
				LinkedList<String> anagrams = hashtable.get(key);
				anagrams.push(string);
			}
			 int index = 0;
			 for (String key : hashtable.keySet()) {
				LinkedList<String> list = hashtable.get(key);
				for (String t : list) {
					array[index] = t;
					index++;
				}
			}
		}

		private String sortChars(String string) {
			// TODO Auto-generated method stub
			return null;
		}
	}

