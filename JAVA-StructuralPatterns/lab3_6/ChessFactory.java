package lab3_6;

import java.util.ArrayList;

public class ChessFactory {
    private static ChessFactory chessFactory=null;
    private ArrayList chess_black=new ArrayList();
    private ArrayList chess_white=new ArrayList();

    private ChessFactory(){
        Chess _black=new BlackChess("black");
        chess_black.add(_black);
        Chess _white=new WhiteChess("white");
        chess_white.add(_white);
    }
    // 单例模式获取棋子工厂类
    public static ChessFactory getChessFactory() {
        if(chessFactory==null){
            chessFactory=new ChessFactory();
        }
        return chessFactory;
        //双重锁单例模式获取棋子工厂类
//        synchronized (ChessFactory.class) {
//            if (chessFactory == null){
//                synchronized (ChessFactory.class) {
//                    chessFactory = new ChessFactory();
//                }
//            }
//        }
//        return chessFactory;
    }
    // 棋子工厂根据color构造不同的对象，并放入共享池
    public Chess getChess(String color){
        if(color.equalsIgnoreCase("black")){
            return (Chess)chess_black.get(0);
        }
        else if(color.equalsIgnoreCase("white")){
            return (Chess)chess_white.get(0);
        }
        else{
            return null;
        }
    }
    //获得棋子数
    public int getBlackChess(){
        return chess_black.size();
    }
    public int getWhiteChess(){
        return chess_white.size();
    }
}

