# newlesson9

①localhost:8080/api/v1/movies にアクセスするとDBに登録されている名前をレスポンスとして返す。

<img width="1111" alt="スクリーンショット 2023-02-20 10 18 35" src="https://user-images.githubusercontent.com/120763272/219988353-5d4e23cd-8c03-4ce3-bcc0-d79a6751102f.png">


②localhost:8080/api/v1/movies?published_year=yyyy にアクセスするとDBに登録されている映画からyyyy年に
公開された映画をレスポンスとして返す。また、存在しない年の場合はDBに登録されている情報を返す。

<img width="1098" alt="スクリーンショット 2023-02-20 10 20 10" src="https://user-images.githubusercontent.com/120763272/219988487-0379e35c-e64f-4cde-b6e4-b584ee1746d2.png">

③にアクセスするとDBに登録されている映画をタイトルで検索して呼び出すことができる。また、存在しないタイトルの場合はメッセージを返す。

<img width="1098" alt="スクリーンショット 2023-02-20 10 24 35" src="https://user-images.githubusercontent.com/120763272/219988827-ebdc8f98-82de-4601-a96c-c8113fc2254c.png">
