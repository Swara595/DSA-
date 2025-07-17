 Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int X=sc.nextInt();
		int flag=0;//not found
		int[] A=new int[N];
		for(int i=0;i<N;i++){
		    A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
		    if(A[i]==X){
		        flag=1;
		        break;
		    }
		}
		if(flag==1){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		
