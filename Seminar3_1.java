/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seminar3_1;

/**
 *
 * @author vluca
 */
public class Seminar3_1 {


	static int ternarySearch(int l, int r, int key, int ar[])
	{
		if (r >= l) {

			int mid1 = l + (r - l) / 3;
			int mid2 = r - (r - l) / 3;

			if (ar[mid1] == key) {
				return mid1;
			}
			if (ar[mid2] == key) {
				return mid2;
			}

			if (key < ar[mid1]) {

				return ternarySearch(l, mid1 - 1, key, ar);
			}
			else if (key > ar[mid2]) {

				return ternarySearch(mid2 + 1, r, key, ar);
			}
			else {

				return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
			}
		}

		return -1;
	}

	public static void main(String args[])
	{
		int l, r, p, key;

		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		l = 0;

		r = 9;

		key = 5;

		p = ternarySearch(l, r, key, ar);

		System.out.println("Index of " + key + " is " + p);

		key = 50;

		p = ternarySearch(l, r, key, ar);

		System.out.println("Index of " + key + " is " + p);
	}
}

