# Use a vulnerable version of NGINX (intentionally outdated)
FROM nginx:1.19.0

# Install an outdated and vulnerable package
RUN apt-get update && apt-get install -y wget=1.20.3-1ubuntu1 curl \
    && apt-get clean


# Add a fake sensitive file to simulate secrets in the image
RUN echo "root:root" > /root/password.txt

# Copy a basic index.html file
COPY index.html /usr/share/nginx/html/index.html

# Expose port 80
EXPOSE 80

# Start the NGINX server
CMD ["nginx", "-g", "daemon off;"]
