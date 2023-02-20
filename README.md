# newlesson9
⓪localhost:8080/api/v1/movies/allをDB内データ確認用として実装

<img width="1098" alt="スクリーンショット 2023-02-20 11 00 45" src="https://user-images.githubusercontent.com/120763272/219992139-91b2e250-0070-4457-8e55-4e649671d407.png">


①localhost:8080/api/v1/movies にアクセスするとDBに登録されている名前をレスポンスとして返す。

<img width="1098" alt="スクリーンショット 2023-02-20 11 02 58" src="https://user-images.githubusercontent.com/120763272/219992274-d0d0717a-63c6-43ad-8825-eaa4786efae1.png">



②localhost:8080/api/v1/movies?published_year=yyyy にアクセスするとDBに登録されている映画からyyyy年に
公開された映画をレスポンスとして返す。また、存在しない年の場合はDBに登録されている情報を返す。

<img width="1098" alt="スクリーンショット 2023-02-20 11 03 32" src="https://user-images.githubusercontent.com/120763272/219992309-be940ade-632f-4a53-94b6-e945d819db6e.png">

③localhost:8080/api/v1/movies/title?title=タイトル名にアクセスするとDBに登録されている映画のタイトルから該当するタイトルのリスト情報をレスポンスとして返す。また、存在しないタイトルの場合はメッセージを返す。

1.存在するとき
<img width="1098" alt="スクリーンショット 2023-02-20 11 04 50" src="https://user-images.githubusercontent.com/120763272/219992446-54270d05-bee6-490b-b6b6-d33dc78ff125.png">

2.存在しない時
<img width="1018" alt="スクリーンショット 2023-02-20 11 06 48" src="https://user-images.githubusercontent.com/120763272/219992607-6c71b24c-53c8-4a3f-8c7e-cff3e55d7290.png">

④localhost:8080/api/v1/movies/{id}にアクセスすると該当するidのリスト情報をレスポンスとして返す。

<img width="1100" alt="スクリーンショット 2023-02-20 11 08 39" src="https://user-images.githubusercontent.com/120763272/219993035-3de496e5-294e-4909-8199-753c2f0b8c9d.png">
