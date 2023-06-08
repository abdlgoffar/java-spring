package learning.E_components.repositories;

import learning.E_components.client.ClientSellerApi;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

//disini contoh pembuatan factory component atau class tiruan.
//anggap class ClientSellerApi berasal dari dependency atau library orang lain, jadi disini dibuatkan object tiruannya
//menggunakan Factory bean interface
@Component("clientSellerApi")
public class ClientSellerApiFactoryBean implements FactoryBean<ClientSellerApi> {
    @Override
    public ClientSellerApi getObject() throws Exception {
        ClientSellerApi clientSellerApi = new ClientSellerApi();
        clientSellerApi.setEndPoint("https/toko-sembako.com");
        return clientSellerApi;
    }

    @Override
    public Class<?> getObjectType() {
        return ClientSellerApi.class;
    }
}
