  Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(Math.max(0, N - M));
        }
