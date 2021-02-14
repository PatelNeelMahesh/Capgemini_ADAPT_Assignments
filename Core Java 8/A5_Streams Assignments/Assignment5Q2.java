package com.company;

import java.util.*;
class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }
    public int getNewsId() {
        return newsId;
    }
    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }
    public String getPostedByUser() {
        return postedByUser;
    }
    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }
    public String getCommentByUser() {
        return commentByUser;
    }
    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", postedByUser='" + postedByUser + '\'' +
                ", commentByUser='" + commentByUser + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
public class Assignment5Q2 {
    public static int maxComments(List<News> news) {
        Optional<News> obj = news.stream().max(Comparator.comparing(News::getComment));
        List<Integer> l = new ArrayList<>();
        obj.stream().forEach(ite->{int nid =ite.getNewsId(); l.add(nid);});
        return l.stream().findFirst().get();
    }

    public static int budgetCount (List < News > news) {
        List<String> obj1 = new ArrayList<>();
        news.stream().forEach(a->obj1.add(a.getComment()));
        int c = 0;
        for(String str:obj1) {if(str.contains("budget")) {c++;}}
        return c;
    }
    public static String maxCommentsByUser (List < News > news) {
        Optional<News> obj3 = news.stream().min(Comparator.comparing(News::getCommentByUser));
        List<String> n = new ArrayList<>();
        obj3.stream().forEach(i->n.add(i.getCommentByUser()));
        return n.stream().findFirst().get();
    }
    public static <M, T extends Comparable<T>> Map<M, T> sortByValues(final Map<M, T> map) {
        Comparator<M> compare =
                new Comparator<M>() {
                    public int compare(M m1, M m2) {
                        int compare = map.get(m2).compareTo(map.get(m1));
                        if (compare == 0)
                            return 1;
                        else
                            return compare; }};
        Map<M, T> obj = new TreeMap<M, T>(compare);
        obj.putAll(map);
        return obj;
    }

    public static Map<String, Integer> sortMaxCommentsByUser (List<News> news)
    {
        Map<String,Integer> obj1 = new TreeMap<>();
        List<String> u = new ArrayList<String>();
        news.stream().forEach(i->u.add(i.getCommentByUser()));
        for(String n: u) {
            obj1.put(n,0); }
        for(String n: u) {
            obj1.put(n,obj1.get(n)+1); }
        Map<String, Integer> obj = sortByValues(obj1);
        return obj;
    }
    public static void main(String[] args) {}
}