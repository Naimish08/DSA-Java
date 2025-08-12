package MaximumKtoSortPermutation;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int sortPermutation(int[] arr) {
        int len = arr.length;
        boolean alreadySorted = true;
        for (int i = 0; i < len; i++) {
            if (arr[i] != i) {
                alreadySorted = false;
                break;
            }
        }
        if (alreadySorted) return 0;

        int big = len - 1;
        int bits = 31 - Integer.numberOfLeadingZeros(big);

        for (int maybeK = (1 << (bits + 1)) - 1; maybeK >= 0; maybeK--) {
            UF uf = new UF(len);
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if ((arr[i] & arr[j]) == maybeK) {
                        uf.stick(i, j);
                    }
                }
            }

            boolean ok = true;
            for (int z = 0; z < len; z++) {
                if (arr[z] != z) {
                    int target = findWhere(arr, z);
                    if (uf.grab(z) != uf.grab(target)) {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok) return maybeK;
        }

        return 0;
    }

    private int findWhere(int[] a, int val) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == val) return i;
        }
        return -1;
    }

    class UF {
        int[] par;

        UF(int n) {
            par = new int[n];
            for (int i = 0; i < n; i++) par[i] = i;
        }

        int grab(int x) {
            if (par[x] != x) par[x] = grab(par[x]);
            return par[x];
        }

        void stick(int x, int y) {
            int a = grab(x);
            int b = grab(y);
            if (a != b) par[b] = a;
        }
    }
}
