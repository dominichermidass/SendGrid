#  A Simple Guide to SENDGRID
## ABSTRACT
In order to use SEND EMAIL API from SENDGRID  you have to create an acc, then generate an APIKEY that will allow you to use the API (this key is perpetual), create a sender acc, and you are ready to go. If you need to implement dynamic templates, first you have to create one in https://sendgrid.com/dynamic_templates . keep in mind you have to use the template id in the http request along with the variables you wanna send. 


1. GET API KEY (https://app.sendgrid.com/settings/api_keys)

2. CREATE A SENDER.

3. ONCE API KEY IS CREATED, PUT IT INTO THE HTTP HEADER AS WHO BELOW: 
"--url" -> "https://api.sendgrid.com/v3/mail/send" (ENDPOINT-TO USE AND SEND DYNAMICS EMAIL)
"Authorization" -> "Bearer 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" (APIKEY)
"Content-Type" -> "Application/JSON"





4. IN THE PAYLOAD AREA YOU SHOULD PUT DESTINATION AND SOURCE MAILS ACC, SUBJECT, AND THE CONTENT
OF THE MESSAGEE.
 
```json
{
  "personalizations": [
    {
      "to": [
        {
          "email": "dominic_hermida@hotmail.com"
        }
      ],
      "dynamic_template_data":{
			"nombre": "Dominic",
			"premio" : "Una Casa",
			"url" : "www.Hacked.com"
		}
    }
  ],
  "from": {
    "email": "noReply@alphait.mx"
  },
  "subject": "Hello, World!",
  "content": [
    {
      "type": "text/plain",
      "value": "HEY!"
    }
  ],
  "template_id" : "d-1e9c54e133974b4b944b22c072bad400"
}
```

5. IF YOU WANT TO USE A DYNAMIC TAMPLATE, YOU SHOULD PUT THE TEMPLATE ID INSIDE JSON CONTENT IN THE FIELD TEMPLATE_ID, INDICATING THE ID OF THE TEMPLATE YOU CREATED. FOR SENDING VARIABLES YOU SHOULD ADD TO THE JSON dynamid_tample_data  field as showed below, indicating the variables you want to send and in the template part you recibe them like this {{variable}}.

____
## OBSERVATIONS
_____


API KEYS ARE PERPETUALs, althougt they can be deleted or edited
REQUEST ARE LIMITED TO YOUR USER PLAN. for limit ratios see SendGrids specific Plans https://sendgrid.com/pricing/
