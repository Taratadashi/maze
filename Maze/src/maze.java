import java.util.*;

public class maze {
	public static void main(String args[]) {
		int dx[] = {0, 1, 0, -1};
		int dy[] = {1, 0, -1, 0};
		int i,j,a,b;
		int MAP[][];
		MAP = new int[11][11];
		for (i = 0 ; i < 11 ; i++){
		    for (j = 0 ; j < 11 ; j++){
		      MAP[i][j] = 0;
		    }
		  }
		MAP[1][1]=1;	//スタート
		MAP[9][9]=9;	//ゴール
		 for (i = 0 ; i < 11 ; i++){
			    MAP[0][i] = 4;
			    MAP[10][i] = 4;
			    MAP[i][0] = 4;
			    MAP[i][10] = 4;
		 }
		 for (i = 1 ; i <= 5 ; i++){
			    for (j = 1 ; j <= 5 ; j++){
			      MAP[i*2][j*2] = 4;
			    }
			  }

		 for (a = 1 ; a <= 4 ; a++){
		      for (b = 1 ; b <= 4 ; b++){
		        if (a == 1){
		        	int g = (int)(Math.random() * 4);
		          MAP[a * 2 + dx[g]][b * 2 + dy[g]] = 4;
		        }else{
		          boolean flag = true;
		          while(flag){
		        	  int h = (int)(Math.random() * 3);
		            if (MAP[a * 2 + dx[h]][b * 2 + dy[h]] == 0){
		              MAP[a * 2 + dx[h]][b * 2 + dy[h]] = 4;
		              flag = false;
		            }
		          }
		        }
		      }
		 }

	         for (int x = 0; x < MAP.length; x++) {
	                for (int y = 0; y < MAP[x].length; y++) {

	                    System.out.print(MAP[x][y]);

	                }
	                System.out.print("\r\n");
	         }

	}

}

