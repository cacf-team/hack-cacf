# hack-cacf



## Use cases

- [X] `ViewAdvisors` : voir une liste de conseillers et leurs spécialités (none, savings, credits ou insurance)<br/>
- [X] `ViewCustomer` : voir les informations relatives à un client<br/>
- [X] `EditCustomer` : mettre à jour les informations relatives à un client<br/>
- [X] `AddCustomer` : ajouter un nouveau client au système<br/>
- [X] `ViewCard` : voir les informations relatives à une carte bleue<br/>
- [X] `EditCard` : mettre à jour les informations relatives à une carte bleue<br/>
- [X] `AddCard` : ajouter une nouvelle carte bleue au système<br/>
- [X] `ViewPayment` : voir des informations relatives à l'historique de paiement d’une carte bleue<br/>
- [X] `AddPayment` : ajouter des informations relatives à un paiement (nature du paiement)<br/>
- [X] `Monitoring` : monitorer chaque appels et leur durée<br/>
- [X] `Logging` : centraliser les logs de l'application


## Resources

**Function Advisor**
```
    GET /advisors
```

**Function Customer**
```
    GET  /customers&lastName={lastName}
    GET  /customers/{customerId}
    POST /customers
    PUT  /customers/{customerId}
```

**Function Card**
```
    GET  /cards&customerId={customerId}
    GET  /cardTypes
    GET  /cards/{cardId}
    POST /cards
    PUT  /cards/{cardId}
```

**Function Payment**
```
    GET  /payments&cardId={cardId}
    POST /payments/
```



## Models

**advisor**
```
{
  id              integer($int4)
  firstName       string
  lastName        string
  specialities    [
                   speciality {
                     id      integer($int4)
                     name    string
                   }
                  ]
}
```

**customer**
```
{
  id              integer($int4)
  firstName       string
  lastName        string
  address         string
  city            string
  telephone       string
}
```

**card**
```
{
  id              integer($int4)
  name            string
  birthDate       string
  cardTypeId      integer($int4)
  customerId      integer($int4)
}
```

**cardType**
```
{
  id              integer($int4)
  name            string
}
```

**payment**
```
{
  id              integer($int4)
  paymentDate     string
  description     string
  cardId          integer($int4)
}
```


## Equipe 

- Jordan
- Elyes
- Manel
- Mahfoudh
