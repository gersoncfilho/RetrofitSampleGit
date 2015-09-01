# RetrofitSampleGit
Fully functional sample of retrofit

Instruções de utilização do Retrofit

1 - Criação da classe POJO. Nessa classe deveremos definir todos os campos do JSON/XML que quisermos que seja mostrado,
    só há a necessidade de criação dos campos que forem ser utilizados, podemos ignorar os que não tiverem utilidade.
    
2 - Criação a interface. Nessa interface, devemos definir os métodos de GET, POST, PUT e DELETE. Para este exemplo utilizei
    apenas o GET.
    
    //segunda parte da url, lembrar sempre de iniciar com a /
    //faz parte da composição da url o placeholder {user}. Este placeholder é passado através de um EditText no layout
    //onde o username do github é passado.
    @GET("/users/{user}")
    
    //aqui definimos o método GET propriamente dito. Este método é composto pela String do usuário e pelo Callback(response).
    //response é o resultado da consulta ao WS, os campos foram definidos na classe POJO
    public void getFeed(@Path("user") String user, Callback<GitModel> response);     

3 - Criação do REST. Nesta classe devemos definir a conexão ao WS.
    //cria um adapter para o retrofit com uma url de base. Esta url será concatenada com o restante que se encontra
    //na Interface criada no item 2.
    RestAdapter restAdapter = new RestAdapter.Builder()
      .setEndpoint(API).build();
    //criação do serviço para o adapter com nossa classe de GET
    GitApi git = restAdapter.create(GitApi.class);

    //Agora, precisamos chamar pelo response
    //Retrofit utiliza o gson para a conversão JSON-POJO
    
    git.getFeed(user, new Callback<GitModel>() {
    @Override
    public void success(GitModel GitModel, Response response) {
    //pegamos o objeto json do servidor github para a nossa classe de modelo POJO

   tv.setText("Github Name :" + GitModel.getName() + "\nWebsite: " + GitModel.getBlog() + "\nCompany Name: " + GitModel.getCompany() +
   "\nLogin: " + GitModel.getLogin() + "\nId: " + GitModel.getId() + "\nAvatar URL: " + GitModel.getAvatar_url());

  pbar.setVisibility(View.INVISIBLE);                               //disable progressbar
  }

 @Override
 public void failure(RetrofitError error) {
 tv.setText(error.getMessage());
 pbar.setVisibility(View.INVISIBLE);                               //disable progressbar
 }
