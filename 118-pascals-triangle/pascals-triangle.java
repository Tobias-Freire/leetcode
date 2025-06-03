class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return result;
        }

        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                result.add(new ArrayList<>(Arrays.asList(1)));
            } else if (i == 1) {
                result.add(new ArrayList<>(Arrays.asList(1,1)));
            } else {
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        result.add(new ArrayList<>(Arrays.asList(1)));
                    }else if (j == i) {
                        result.get(i).add(1);
                    } else {
                        int upperLeft = result.get(i-1).get(j-1);
                        int upperRight = result.get(i-1).get(j);
                        result.get(i).add(upperLeft + upperRight);
                    }
                }
            }
        }
        return result;
    }
}