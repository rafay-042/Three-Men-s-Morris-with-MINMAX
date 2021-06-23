/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Raf
 */
public class JavaApplication58 {

    /**
     * @param args the command line arguments
     */
    public char[] arr= new char[9];
    
   JavaApplication58(){
       
       for(int i=0;i<9;i++){
       
           arr[i]='_';
       }
   }
   
   
   public void print(){
       
       for(int i=0;i<9;i++){
       
           System.out.print(""+arr[i] + " ");
       
           if((i+1)%3==0)
               System.out.println("");
       };
   
   }
   
   public boolean uchkwin(char[] arr){
       if(arr[0]=='*' && arr[1]=='*' && arr[2]=='*'){
           System.out.println("You Win!! hehehe");
           return true;
       }
       else if(arr[3]=='*' && arr[4]=='*' && arr[5]=='*'){
           System.out.println("You Win!! hehehe");
           return true;
       }
       else if(arr[6]=='*' && arr[7]=='*' && arr[8]=='*'){
           System.out.println("You Win!! hehehe");
           return true;
       }
       
       else if(arr[0]=='*' && arr[3]=='*' && arr[6]=='*'){
           System.out.println("You Win!! hehehe");
           return true;
       }
       else if(arr[1]=='*' && arr[4]=='*' && arr[7]=='*'){
           System.out.println("You Win!! hehehe");
           return true;
       }
       else if(arr[2]=='*' && arr[5]=='*' && arr[8]=='*'){
           System.out.println("You Win!! hehehe");
           return true;
       }
       
       else if(arr[0]=='*' && arr[4]=='*' && arr[8]=='*'){
           System.out.println("You Win!! hehehe");
           return true;
       }
       else if(arr[2]=='*' && arr[4]=='*' && arr[6]=='*'){
           System.out.println("You Win!! hehehe");
           return true;
       }
       else
           return false;
       
   }
   
   public boolean cchkwin(char[] arr){
       if(arr[0]=='o' && arr[1]=='o' && arr[2]=='o'){
           System.out.println("CPU Wins!! ");
           return true;
       }
       else if(arr[3]=='o' && arr[4]=='o' && arr[5]=='o'){
           System.out.println("CPU Wins!!");
           return true;
       }
       else if(arr[6]=='o' && arr[7]=='o' && arr[8]=='o'){
           System.out.println("CPU Wins!!");
           return true;
       }
       
       else if(arr[0]=='o' && arr[3]=='o' && arr[6]=='o'){
           System.out.println("CPU Wins!!");
           return true;
       }
       else if(arr[1]=='o' && arr[4]=='o' && arr[7]=='o'){
           System.out.println("CPU Wins!!");
           return true;
       }
       else if(arr[2]=='o' && arr[5]=='o' && arr[8]=='o'){
           System.out.println("CPU Wins!!");
           return true;
       }
       
       else if(arr[0]=='o' && arr[4]=='o' && arr[8]=='o'){
           System.out.println("CPU Wins!!");
           return true;
       }
       else if(arr[2]=='o' && arr[4]=='o' && arr[6]=='o'){
           System.out.println("CPU Wins!!");
           return true;
       }
       else
          return  false;
   }
   
//   public void blocked(int ind){
//       
//       for(int i=0;i<3;i++){
//           
//       
//       
//       
//       }
//   }
   
   public ArrayList<Integer> blocked(int index){
       
       ArrayList<Integer> paths = new ArrayList<Integer>();
       
       if(index%3==0){
            if(index==0 ){
                if (arr[index+1]=='_'){
                    paths.add(index+1);
                }
                if (arr[index+3]=='_'){
                    paths.add(index+3);
                }
                if (arr[index+4]=='_'){
                    paths.add(index+4);
                }
            }
            else if(index==3){
                
                if (arr[index+1]=='_'){
                    paths.add(index+1);
                }
                if (arr[index+3]=='_'){
                    paths.add(index+3);
                }
                if (arr[index-3]=='_'){
                    paths.add(index+4);
                }
            
            
            }
            
            else if(index==6){
                
                if (arr[index+1]=='_'){
                    paths.add(index+1);
                }
                if (arr[index-3]=='_'){
                    paths.add(index-3);
                }
                if (arr[index-2]=='_'){
                    paths.add(index-4);
                }
            
            
            }
        
        }
        else if(index%3==1){
            if(index==1){
                if (arr[index-1]=='_'){
                    paths.add(index-1);
                }
                if (arr[index+1]=='_'){
                    paths.add(index+1);
                }
                if (arr[index+3]=='_'){
                    paths.add(index+3);
                }
//                if (arr[index+4]=='_'){
//                    paths.add(index+4);
//                }
            }
            else if(index==4){
                if (arr[index-1]=='_'){
                    paths.add(index-1);
                }
                if (arr[index+1]=='_'){
                    paths.add(index+1);
                }
                if (arr[index+3]=='_'){
                    paths.add(index+3);
                }
                if (arr[index-3]=='_'){
                    paths.add(index-3);
                }
                if (arr[index-2]=='_'){
                    paths.add(index-2);
                }
                if (arr[index+2]=='_'){
                    paths.add(index+2);
                }
                if (arr[index-4]=='_'){
                    paths.add(index-4);
                }
                if (arr[index+4]=='_'){
                    paths.add(index+4);
                }
//                if (arr[index+4]=='_'){
//                    paths.add(index+1);
//                }
            
            
            }
            
            else if(index==7){
            
              if (arr[index-1]=='_'){
                    paths.add(index-1);
                }
                if (arr[index+1]=='_'){
                    paths.add(index+1);
                }
                if (arr[index-3]=='_'){
                    paths.add(index-3);
                }
//                if (arr[index+4]=='_'){
//                    paths.add(index+1);
//                }
            
            
            
            }
        
        
        }
        else if(index%3==2){
               if(index==2){
               
                if (arr[index-1]=='_'){
                    paths.add(index-1);
                }
                if (arr[index+3]=='_'){
                    paths.add(index+3);
                }
                if (arr[index+2]=='_'){
                    paths.add(index+2);
                }
               
               
               }
               
               else if(index==5){
                   if (arr[index-1]=='_'){
                    paths.add(index-1);
                }
                if (arr[index+3]=='_'){
                    paths.add(index+3);
                }
//                if (arr[index+2]=='_'){
//                    paths.add(index+2);
//                }
                if (arr[index-3]=='_'){
                    paths.add(index-3);
                }
               
               }
               
                else if(index==8){
                if (arr[index-1]=='_'){
                    paths.add(index-1);
                }
                if (arr[index-4]=='_'){
                    paths.add(index-4);
                }
                if (arr[index-3]=='_'){
                    paths.add(index-3);
                }
               
               }
        
        }
       return paths;
   }
   
   
   
   
   public int evaluate(){
 
        int value=0;
        int z;
        int j=0; 
        
                for(int i=0;i<9;i++){
                    
                    if((i%3==0)){
                           
                    if(arr[i] == 'o'&& arr[i+1]=='o'  && arr[i+2]=='o')
                    value+=1000000;
                else if(arr[i] == '*'&& arr[i+1]=='*'  && arr[i+2]=='*')
                    value-=1000000;

                    }                    
                }
                //rows
                for(int i=0;i<9;i++){
                    
                    if((i%3==0)){
                if(arr[i] == 'o'&& arr[i+1]=='o'  && arr[i+2]=='_')
                    value+=11;
                
                else if(arr[i] == 'o'&& arr[i+2]=='o'  && arr[i+1]=='_')
                    value+=11;
                
                else if(arr[i+1] == 'o'&& arr[i+2]=='o'  && arr[i]=='_')
                    value+=11;
                
                if(arr[i] == '*'&& arr[i+1]=='*'  && arr[i+2]=='_')
                    value+=11;
                
                else if(arr[i] == '*'&& arr[i+2]=='*'  && arr[i+1]=='_')
                    value+=11;
                
                else if(arr[i+1] == '*'&& arr[i+2]=='*'  && arr[i]=='_')
                    value+=11;
                                       
                    }
                }
                
                 //cool
                for(int i=0;i<3;i++){
                    if(arr[i] == 'o'&& arr[i+3]=='o'  && arr[i+6]=='_')
                    value+=11;
                
                else if(arr[i] == 'o'&& arr[i+6]=='o'  && arr[i+3]=='_')
                    value+=11;
                
                else if(arr[i+3] == 'o'&& arr[i+6]=='o'  && arr[i]=='_')
                    value+=11;
                    
                if(arr[i] == '*'&& arr[i+3]=='*'  && arr[i+6]=='_')
                    value-=15;
                
                else if(arr[i] == '*'&& arr[i+6]=='*'  && arr[i+3]=='_')
                    value-=15;
                
                else if(arr[i+3] == '*'&& arr[i+6]=='*'  && arr[i]=='_')
                    value-=15;
                
                if(arr[i] == '*'&& arr[i+3]=='*'  && arr[i+6]=='_')
                    value-=15;
                
                else if(arr[i] == '*'&& arr[i+6]=='*'  && arr[i+3]=='_')
                    value-=15;
                
                else if(arr[i+3] == '*'&& arr[i+6]=='*'  && arr[i]=='_')
                    value-=15;
                     
                
                }
                
        if(arr[0]=='o' && arr[4]=='o' && arr[8]=='o')
            value+=1000000;
        else if(arr[0]=='*' && arr[4]=='*' && arr[8]=='*')
            value-=1000000;
        
        if(arr[0]=='o' && arr[4]=='o' && arr[8]=='_')
            value+=11;
        else if(arr[0]=='o' && arr[8]=='o' && arr[4]=='_')
            value+=11;
        else if(arr[4]=='o' && arr[8]=='o' && arr[0]=='_')
            value+=11;
        
        if(arr[0]=='*' && arr[4]=='*' && arr[8]=='_')
            value-=15;
        else if(arr[0]=='*' && arr[8]=='*' && arr[4]=='_')
            value-=15;
        else if(arr[4]=='*' && arr[8]=='*' && arr[0]=='_')
            value-=15;
        
        if(arr[2]=='o' && arr[4]=='o' && arr[6]=='o')
            value+=1000000;
        else if(arr[2]=='*' && arr[4]=='*' && arr[6]=='*')
            value-=1000000;
        
        if(arr[2]=='o' && arr[4]=='o' && arr[6]=='_')
            value+=11;
        else if(arr[2]=='o' && arr[6]=='o' && arr[4]=='_')
            value+=11;
        else if(arr[4]=='o' && arr[6]=='o' && arr[2]=='_')
            value+=11;
        
        if(arr[2]=='*' && arr[4]=='*' && arr[6]=='_')
            value-=15;
        else if(arr[2]=='*' && arr[6]=='*' && arr[4]=='_')
            value-=15;
        else if(arr[4]=='*' && arr[6]=='*' && arr[2]=='_')
            value-=15;
        
        
        
        
        
        
                
        //System.out.println("vslfdf" + value);
        return value;
        
    }
   
   public int minMax(int depth,boolean isMax){
       int score  = evaluate();
//       int[] a = new int[2];
//       a[0]=0;
//       
       if(depth==0){
//           a[1]=score;
           return score;
       }
       
       if (score == 1000000){
//       a[1]=score;
           return score;
        
       }
    // If Minimizer has won the game
    // return his/her evaluated score
    if (score == -1000000){
     //  a[1]=score;
           return score;
        
       }
    
    if(isMax){
    
    int best = -1000;
    
    for(int i=0;i<9;i++){
        if(arr[i]=='_'){
            
            arr[i]='o';
            
            int a2=minMax(depth-1,false);
            best = Math.max(best,a2);
            
                        arr[i]='_';
        }
    
    }
    
    return best;
    }
    
    else {
    
        int best = 1000;
    
    for(int i=0;i<9;i++){
        if(arr[i]=='_'){
            
            arr[i]='*';
            
            int a2=minMax(depth-1,false);
            best = Math.min(best,a2);
            
            arr[i]='_';
        
        }
    
    }
    
    return best;
    
    
    }
 
   
   
   }
   
public int ProminMax(ArrayList<Integer> a,int depth,boolean isMax){
       int score  = evaluate();
//       int[] a = new int[2];
//       a[0]=0;
//       
       if(depth==0){
//           a[1]=score;
           return score;
       }
       
       if (score == 110){
//       a[1]=score;
           return score;
        
       }
    // If Minimizer has won the game
    // return his/her evaluated score
    if (score == -120){
     //  a[1]=score;
           return score;
        
       }
    
    if(isMax){
    
    int best = -10000000;
    
    for(int i=0;i<a.size();i++){
        if(arr[a.get(i)]=='_'){
            
            arr[a.get(i)]='o';
            
            int a2=minMax(depth-1,false);
            best = Math.max(best,a2);
            
                        arr[a.get(i)]='_';
        }
    
    }
    
    return best;
    }
    
    else {
    
        int best = 10000000;
    
    for(int i=0;i<a.size();i++){
        if(arr[a.get(i)]=='_'){
            
            arr[a.get(i)]='*';
            
            int a2=minMax(depth-1,false);
            best = Math.min(best,a2);
            
            arr[a.get(i)]='_';
        
        }
    
    }
    
    return best;
    
    
    }
 
   
   
   }
   
int findBestMove(){
    int bestVal = -10000000;
    int bestMove=-1;
    // Traverse all cells, evaluate minimax function
    // for all empty cells. And return the cell
    // with optimal value.
    for (int i = 0; i < 9; i++)
    {
        
            // Check if cell is empty
            if (arr[i] == '_')
            {
                // Make the move
                arr[i] = '*';
 
                // compute evaluation function for this
                // move.
                int moveVal = minMax( 3, false);
 
                // Undo the move
                arr[i]= '_';
 
                // If the value of the current move is
                // more than the best value, then update
                // best/
                if (moveVal > bestVal)
                {
                    bestMove=i;
                    bestVal = moveVal;
                }
            }
     }
    
 
    //System.out.printf("The value of the best Move " +
               //              "is : %d\n\n", bestVal);
 
    return bestMove;
}  


int[] ProfindBestMove(ArrayList<Integer> a){
    int bestVal = -10000000;
    int bestMove=-1;
    // Traverse all cells, evaluate minimax function
    // for all empty cells. And return the cell
    // with optimal value.
    for (int i = 0; i < a.size(); i++)
    {
        
            // Check if cell is empty
            if (arr[a.get(i)] == '_')
            {
                // Make the move
                arr[a.get(i)] = '*';
 
                // compute evaluation function for this
                // move.
                int moveVal = ProminMax(a,100, false);
 
                // Undo the move
                arr[a.get(i)]= '_';
 
                // If the value of the current move is
                // more than the best value, then update
                // best/
                if (moveVal > bestVal)
                {
                    bestMove=a.get(i);
                    bestVal = moveVal;
                }
            }
     }
    
 
    //System.out.printf("The value of the best Move " +
                           //  "is : %d\n\n",bestMove);
 
    return new int[] {bestMove,bestVal};
}
   
   
    
    public static void main(String[] args) {
        
        ArrayList<Integer> ab= new ArrayList<Integer>();
        // TODO code application logic here
        int[] goti1,goti2,goti3= new int[2];
        JavaApplication58 ja = new JavaApplication58();
        ja.print();
        Scanner scan=new Scanner(System.in);
        int umove=0;
        int uway=0;
        int index=0;
        int c=0;
        while(c<3){
        System.out.println("Enter Value from 0 to 8");
        index=scan.nextInt();
            
            if(ja.arr[index]=='_'){
                ja.arr[index]='*';
                c++;
            }
        index = ja.findBestMove();
        
        ab.add(index);
        if(ja.arr[index]=='_'){
                ja.arr[index]='o';
            }
        ja.print();
        ja.uchkwin(ja.arr);
        if(ja.uchkwin(ja.arr)==true)
            break;
        ja.cchkwin(ja.arr);
        if(ja.cchkwin(ja.arr)==true)
            break;
          // c++;
        }
        while(true){
//            
              System.out.println("Pick the gouti u want to move");
              umove=scan.nextInt();
              System.out.println("Where do u want to move it");
              uway=scan.nextInt();
              ArrayList<Integer> aa =ja.blocked(umove);
              
              for(int i=0;i<aa.size();i++){
                  
                  System.out.println("paths: " + aa.get(i));
              
              }
              if(aa.contains(uway)){
                  System.out.println("it does contain the value");
                  ja.arr[uway]='*';
                  ja.arr[umove]='_';
              }
              else
                  System.out.println("Illegal move");
              ja.print();
              ja.uchkwin(ja.arr);
              if(ja.uchkwin(ja.arr)==true)
              break;
              
             
             goti1= ja.ProfindBestMove(ja.blocked(ab.get(0)));
             //System.out.println("gouti1 is: "+goti1[1]);
             goti2=ja.ProfindBestMove(ja.blocked(ab.get(1)));
             //System.out.println("gouti2 is: "+goti2[1]);
             goti3=ja.ProfindBestMove(ja.blocked(ab.get(2)));
             //System.out.println("gouti3: "+goti3[1]);
             
           //  scan.nextInt();
             int max1=Math.max(goti1[1],goti2[1]);
             int max2=Math.max(max1,goti3[1]);
             //System.out.println("maxxxx " + max2);
             if(max2==goti1[1]){
                 
               //  System.out.println("bogs boassf1" + goti1[0] + ab.get(0));
                 ja.arr[goti1[0]]='o';
                 ja.arr[ab.get(0)]='_';
                 ab.set(0, goti1[0]);
             }
             else if(max2==goti2[1]){
               //  System.out.println("bogs boassf2" + goti1[0] + ab.get(1));
                 ja.arr[goti2[0]]='o';
                 ja.arr[ab.get(1)]='_';
                 ab.set(1,goti2[0]);
             }
             else if(max2==goti3[1]){
                 //System.out.println("bogs boassf3" + goti3[0] + ab.get(2));
                 ja.arr[goti3[0]]='o';
                 ja.arr[ab.get(2)]='_';
                 ab.set(2,goti3[0]);
             }
             ja.print();
             ja.cchkwin(ja.arr);
             if(ja.cchkwin(ja.arr)==true)
             break;
             ja.print();
//            //valid inset
//            //checkwin
//            
//            //ai 
//            //best goti
//            //insety
//            //checkwin
//        //}
//          goti1= ja.ProfindBestMove(ja.blocked(index));
//           goti2=ja.ProfindBestMove(ja.blocked(index));
//           goti3=
//           
//               max(gott1[1],goti2[1],goti[1])
//                   a[0]='o';
//           
    }
    
}
}