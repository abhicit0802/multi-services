Setting up ingress
https://kubeless.io/docs/http-triggers/

multiple services:
https://hackernoon.com/getting-started-with-microservices-and-kubernetes-76354312b556

Use kubectl apply command for updation.

Running services with istio:
1. minikube start --memory=8192 --cpus=4

2. Get the latest istio from internet.
curl -L https://git.io/getLatestIstio | sh -

3. cd istio-<version>.

4. # Create tiller serviceaccount
   $ kubectl create -f install/kubernetes/helm/helm-service-account.yaml

5. # Install Tiller
   $ helm init --service-account tiller

6. Install the istio-init chart to bootstrap all the Istio’s CRDs:
helm install install/kubernetes/helm/istio-init --name istio-init --namespace istio-system

7. kubectl get crds | grep 'istio.io\|certmanager.k8s.io' | wc -l
   23

8. helm install install/kubernetes/helm/istio --name istio --namespace istio-system

Note: Please wait for all istio pods to come up. 
may be while installation some of the instance would see themselves fail.
So we need to wait for a couple of minutes to see it up and running.

9. Create the http-gateway as given in istio-components.

10. Create a virtual service for each service to be deployed.   
