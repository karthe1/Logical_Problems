package com.karthick.solve;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author karthick.r
 *
 */
public class RubikCubeProblem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		int cubicMatrixDimension = br.nextInt();
		int rowsRotationMatrix = br.nextInt();
		int columnsRotationMatrix = br.nextInt();
		int temp = 0;

		int rubikCubeElements[][] = new int[cubicMatrixDimension][cubicMatrixDimension];
		for (int i = 0; i < rubikCubeElements.length; i++) {
			for (int j = 0; j < rubikCubeElements.length; j++) {
				rubikCubeElements[i][j] = br.nextInt();
			}
		}

		int rotateRowElements[] = new int[rowsRotationMatrix];
		for (int i = 0; i < rotateRowElements.length; i++) {
			rotateRowElements[i] = br.nextInt();
		}

		int rotateColumnElements[] = new int[columnsRotationMatrix];
		for (int i = 0; i < rotateColumnElements.length; i++) {
			rotateColumnElements[i] = br.nextInt();
		}

		for (int k : rotateRowElements) {
			for (int i = 0; i < rubikCubeElements.length; i++) {
				if (i == k - 1) {
					temp = rubikCubeElements[i][rubikCubeElements.length - 1];
					for (int j = rubikCubeElements.length - 1; j >= 0; j--) {
						if (j != 0)
							rubikCubeElements[i][j] = rubikCubeElements[i][j - 1];
					}
					rubikCubeElements[i][0] = temp;
				}
			}
		}

		for (int k : rotateColumnElements) {
			for (int i = 0; i < rubikCubeElements.length; i++) {
				if (i == k - 1) {
					temp = rubikCubeElements[rubikCubeElements.length - 1][i];
					for (int j = rubikCubeElements.length - 1; j >= 0; j--) {
						if (j != 0)
							rubikCubeElements[j][i] = rubikCubeElements[j - 1][i];
					}
					rubikCubeElements[0][i] = temp;
				}
			}
		}

		for (int i = 0; i < rubikCubeElements.length; i++) {
			for (int j = 0; j < rubikCubeElements.length; j++) {
				System.out.print(rubikCubeElements[i][j] + " ");
			}
			System.out.println();
		}
	}
}
