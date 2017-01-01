package com.kojingji.task.utils;

import java.util.List;

/**
 * Page分页工具�?
 *
 * 
 *
 * @version
 *
 * @since 2010-2-25
 */
public class PageUtils {

    /**
     * 
     * 功能描述：根据页�?pageNumber)和页面大�?fetchSize)，得到当前页的第�?��记录序号
     *
     * @param pageNumber
     *            当前页码
     * 
     * @param fetchSize
     *            页面大小（每页行数）
     * 
     * @return 当前页的第一条记录序�?
     *
     * 
     *
     * @since
     *
     * 
     */
    public static int getFirstResult(int pageNumber, int fetchSize) {

        if (fetchSize <= 0)
            throw new IllegalArgumentException(
                    "[fetchSize] must great than zero");
        return (pageNumber - 1) * fetchSize;
    }

    /**
     * 
     * 功能描述：计算以currentPageNumber为中心点的前后count个页�?
     *
     * @param currentPageNumber
     *            当前页码
     * 
     * @param lastPageNumber
     *            �?���?��的页码数
     * 
     * @param count
     *            �?��计算的页码�?个数
     * 
     * @return 连接页码的List，List的size可能�?
     *
     * 
     *
     * @since 2010-2-25
     *
     * 
     */
    public static List<Integer> generateLinkPageNumbers(int currentPageNumber,
            int lastPageNumber, int count) {

        int mod = count % 2;

        int startPageNumber = 0;

        int endPageNumber = 0;

        if (mod == 1) {

            int avg = count / 2;

            startPageNumber = currentPageNumber - avg;
            if (startPageNumber <= 0) {
                startPageNumber = 1;
            }

            endPageNumber = currentPageNumber + avg;
            if (endPageNumber > lastPageNumber) {
                endPageNumber = lastPageNumber;
            }
        }

        if (endPageNumber - startPageNumber < count) {
            startPageNumber = endPageNumber - count;
            if (startPageNumber <= 0) {
                startPageNumber = 1;
            }
        }

        java.util.List<Integer> result = new java.util.ArrayList<Integer>();
        for (int i = startPageNumber; i <= endPageNumber; i++) {
            result.add(new Integer(i));
        }
        return result;
    }

    /**
     * 
     * 功能描述：计算记录的�?���?��页码数�?
     *
     * @param totalElements
     *            总行�?
     * 
     * @param fetchSize
     *            页面大小（每页行数）
     * 
     * @return �?���?��的页码数�?
     *
     * 
     *
     * @since 2010-2-25
     *
     * 
     */
    public static int computeLastPageNumber(long totalElements, int fetchSize) {

        long result = totalElements % fetchSize == 0 ? totalElements
                / fetchSize : totalElements / fetchSize + 1;
        if (result <= 1)
            result = 1;
        return (int) result;
    }

    /**
     * 
     * 功能描述：计算页码；将不合法的页码�?转换为合�?
     * 
     * <br>
     * 如果pageNumber < 1 返回 1
     * 
     * <br>
     * 如果pageNumber > �?��页码�?返回�?��页码�?
     *
     * @param pageNumber
     *            当前页码
     * 
     * @param fetchSize
     *            页面大小（每页行数）
     * 
     * @param totalElements
     *            总行�?
     * 
     * @return 正确页码�?
     *
     * 
     *
     * @since 2010-2-25
     *
     * 
     */
    public static int computePageNumber(int pageNumber, int fetchSize,
            long totalElements) {

        if (pageNumber <= 1) {
            return 1;
        }
        if (Integer.MAX_VALUE == pageNumber
                || pageNumber > computeLastPageNumber(totalElements, fetchSize)) { // last
                                                                                   // page
            return computeLastPageNumber(totalElements, fetchSize);
        }
        return pageNumber;
    }

    // public static void main(String args[]) {
    // for(Integer integer : PageUtils.generateLinkPageNumbers(10, 100, 6)){
    // System.out.println(integer);
    // }
    // }
}
