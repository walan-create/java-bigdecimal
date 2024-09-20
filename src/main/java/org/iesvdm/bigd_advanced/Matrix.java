package org.iesvdm.bigd_advanced;

import java.math.BigDecimal;

public class Matrix {
    public static void main(String[] args) {
        BigDecimal[][] matrixA = {
                { new BigDecimal("1.1"), new BigDecimal("2.2"), new BigDecimal("3.3") },
                { new BigDecimal("4.4"), new BigDecimal("5.5"), new BigDecimal("6.6") }
        };

        BigDecimal[][] matrixB = {
                { new BigDecimal("7.7"), new BigDecimal("8.8") },
                { new BigDecimal("9.9"), new BigDecimal("10.1") },
                { new BigDecimal("11.2"), new BigDecimal("12.3") }
        };

        BigDecimal[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static BigDecimal[][] multiplyMatrices(BigDecimal[][] matrixA, BigDecimal[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        BigDecimal[][] result = new BigDecimal[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = BigDecimal.ZERO;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] = result[i][j].add(matrixA[i][k].multiply(matrixB[k][j]));
                }
            }
        }

        return result;
    }
}
