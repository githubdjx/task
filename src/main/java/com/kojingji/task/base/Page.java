package com.kojingji.task.base;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具�?
 * @Class Name Page
 * @Author wangfei
 * @Create In 2014�?0�?9�?
 * @param <T>
 */
public class Page<T> implements Serializable {

    private static final long serialVersionUID = -8123039538589235324L;

    /** 当前�?*/
    protected int currentPage = 1;

    /** 每页记录数，默认10�?*/
    protected int pageSize = 10;

    /** 记录总数 */
    protected long count;

    /** 页数 */
    protected int pages;

    /** 当前页的起始索引,�?�?�� */
    protected int start = 1;

    /** 当前页的结尾索引 */
    protected int end;

    /**
     * 查询列表
     */
    private List<T> list;

    /**
     * 获取当前�?
     * 
     * @return 当前�?
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置当前�?
     * 
     * @param currentPage
     *            当前�?
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 获取每页记录�?
     * 
     * @return 每页记录�?
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置每页记录�?
     * 
     * @param pageSize
     *            每页记录�?
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取记录总数
     * 
     * @return 记录总数
     */
    public long getCount() {
        return count;
    }

    /**
     * 设置记录总数
     * 
     * @param count
     *            记录总数
     */
    public void setCount(long count) {
        this.count = count;

        if (count > 0) {
            // 计算页数
            this.pages = (int) (this.count / this.pageSize);

            if (this.count % this.pageSize > 0) {
                this.pages++;
            }

            // 调整当前�?
            if (this.currentPage > this.pages) {
                this.currentPage = this.pages;
            }

            // 计算当前页的索引
            this.start = (this.currentPage - 1) * this.pageSize;
            this.end = this.start + this.pageSize-1;
        }
    }

    /**
     * 获取页数
     * 
     * @return 页数
     */
    public int getPages() {
        return pages;
    }

    /**
     * @Return the List<T> list
     */
    public List<T> getList() {
        return list;
    }

    /**
     * @Param List<T> list to set
     */
    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * @Return the int start
     */
    public int getStart() {
        return start;
    }

    /**
     * @Param int start to set
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * @Return the int end
     */
    public int getEnd() {
        return end;
    }

    /**
     * @Param int end to set
     */
    public void setEnd(int end) {
        this.end = end;
    }

}